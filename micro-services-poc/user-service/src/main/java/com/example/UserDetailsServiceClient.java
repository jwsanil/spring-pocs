
package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-details-service")
public interface UserDetailsServiceClient {
    @GetMapping("/users-additional-details")
     UserAdditonalDetails getUserAdditonalDetails(@RequestParam String id);
}

