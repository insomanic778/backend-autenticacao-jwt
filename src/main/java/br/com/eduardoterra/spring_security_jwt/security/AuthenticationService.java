package br.com.eduardoterra.spring_security_jwt.security;

import org.springframework.stereotype.Service;
import org.springframework.security.core.Authentication;

@Service
public class AuthenticationService {
    private final JwtService jwtService;

    public AuthenticationService(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    public String authenticate(Authentication authentication){
        return jwtService.generateToken(authentication);
    }     
}
