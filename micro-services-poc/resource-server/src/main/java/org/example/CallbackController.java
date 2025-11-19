package org.example;

import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;

@RestController
public class CallbackController {

    @GetMapping("/callback")
    public ResponseEntity<String> callback(@RequestParam("code") String code) {
        System.out.println("Authorization Code: " + code);

        // Step 1: Prepare request details
        String tokenUrl = "http://localhost:9000/oauth2/token";
        String clientId = "client";
        String clientSecret = "secret";
        String redirectUri = "http://localhost:8080/callback";

        // Step 2: Build HTTP headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        // Basic auth header (client credentials)
        String auth = clientId + ":" + clientSecret;
        String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes());
        headers.set("Authorization", "Basic " + encodedAuth);

        // Step 3: Build request body
        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
        body.add("grant_type", "authorization_code");
        body.add("code", code);
        body.add("redirect_uri", redirectUri);

        // Step 4: Send POST request to /oauth2/token
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(body, headers);
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response = restTemplate.exchange(
                tokenUrl,
                HttpMethod.POST,
                requestEntity,
                String.class
        );

        // Step 5: Return token response to browser/log
        System.out.println("Token Response: " + response.getBody());
        return ResponseEntity.ok(response.getBody());


    }
}
