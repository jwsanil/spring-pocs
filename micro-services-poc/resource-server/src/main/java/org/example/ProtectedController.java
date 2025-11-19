package org.example;

import org.springframework.security.core.Authentication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProtectedController {

    /**
     * Endpoint accessible only if the token has "read" authority.
     */
    @PreAuthorize("hasAuthority('user')")
    @GetMapping("/protected/user")
    public String user(Authentication authentication) {
        // Authentication object is automatically populated by Spring Security
        return "Hello " + authentication.getName() + ", authorities: " + authentication.getAuthorities();
    }

    /**
     * Endpoint accessible only if the token has "write" authority.
     */
    @PreAuthorize("hasAuthority('write')")
    @GetMapping("/protected/admin")
    public String admin(Authentication authentication) {
        return "Admin access granted to " + authentication.getName() + ", authorities: " + authentication.getAuthorities();
    }
}
