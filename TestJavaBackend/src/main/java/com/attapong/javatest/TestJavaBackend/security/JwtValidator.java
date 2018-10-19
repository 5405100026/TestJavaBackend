package com.attapong.javatest.TestJavaBackend.security;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;
import com.attapong.javatest.TestJavaBackend.model.Member;

@Component
public class JwtValidator {


    private String secret = "youtube";

    public Member validate(String token) {

        Member member = null;
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();

            member = new Member();

            member.setUsername(body.getSubject());
            member.setPhone((String) body.get("phone"));
            member.setPassword((String) body.get("password"));
        }
        catch (Exception e) {
            System.out.println(e);
        }

        return member;
    }
}