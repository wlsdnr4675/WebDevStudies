package com.example.demo.sec.domain;

import java.util.Base64;
import java.util.Collection;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class JwtTokenProvider {

    // 컴파일되는 부분은 컴파일 되고나서는 우리가 컨트롤 못함
    // 리소스의 어플리케이션 프로퍼티로 가서
    @Value("spring.jwt.secret")
    private String SECRET_KEY;

    private long tokenValidMilisecond = 1000L * 60 * 60; // 1시간만 토큰 유효

    private final UserDetailsService userDetailsService;

    @PostConstruct
    protected void init() {
        SECRET_KEY = Base64.getEncoder().encodeToString(SECRET_KEY.getBytes());
    }

    // Token 만드는 메서드
    public String createToken(String userPk, Collection<? extends GrantedAuthority> roles) {
        Claims claims = Jwts.claims().setSubject(userPk);
        claims.put("roles", roles);
        Date now = new Date();
        // Jwts jwts = new Jwts == Jwts.builder(); 빌더 패턴이다
        return Jwts.builder().setClaims(claims) // 데이터
                .setIssuedAt(now) // 토큰 발행일자
                .setExpiration(new Date(now.getTime() + tokenValidMilisecond)) // set Expire Time
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY) // 암호화 알고리즘, secret값 세팅
                .compact();
    }

}
