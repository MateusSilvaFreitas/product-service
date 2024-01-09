package com.trifocetreasure.productservice.product.infrastructure.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;

@Service
public class JwtContext {
    private final String token;

    public JwtContext(String token) {
        this.token = token;
    }

    public String getSubject() {
        return extractClaims().getPayload().getSubject();
    }

    public String getClaim(String claimName) {
        return extractClaims().getPayload().get(claimName, String.class);
    }

    private Jws<Claims> extractClaims() {
        SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64.decode("triforce-treasure-super-secret"));
        return Jwts.parser().verifyWith(key).build().parseSignedClaims(token);
    }
}
