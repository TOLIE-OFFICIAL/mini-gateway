package org.open.tolie.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getTokenController {

    @PostMapping("token")
    public String getToken(@RequestBody String token){
        return token;
    }
}
