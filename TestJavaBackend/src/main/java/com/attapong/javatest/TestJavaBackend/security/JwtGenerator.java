package com.attapong.javatest.TestJavaBackend.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;
import com.attapong.javatest.TestJavaBackend.model.Member;

@Component
public class JwtGenerator {


    public String generate(Member member) {


        Claims claims = Jwts.claims()
                .setSubject(member.getUsername());
                 claims.put("phone", member.getPhone());
                 claims.put("password", member.getPassword());


        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, "youtube")
                .compact();
    }
}
