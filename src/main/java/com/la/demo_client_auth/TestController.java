package com.la.demo_client_auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/public")
    public String publicEndpoint() {
        return "Este es un endpoint público";
    }

    @GetMapping("/api/private")
    public String privateEndpoint() {
        return "Este es un endpoint privado protegido con OAuth2";
    }
}
