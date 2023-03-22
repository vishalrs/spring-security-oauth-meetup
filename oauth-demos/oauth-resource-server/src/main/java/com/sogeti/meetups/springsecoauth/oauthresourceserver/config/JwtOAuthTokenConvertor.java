package com.sogeti.meetups.springsecoauth.oauthresourceserver.config;

import com.sogeti.meetups.springsecoauth.oauthresourceserver.model.OAuthClientToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class JwtOAuthTokenConvertor {
    public static OAuthClientToken convert(Jwt jwt) {
        String rawRoles = (String) jwt.getClaims().get("authorities");
        Set<GrantedAuthority> roles = Arrays.stream(rawRoles.split(","))
                                            .map(auth-> new SimpleGrantedAuthority("ROLE_" + auth))
                                            .collect(Collectors.toSet());
        return new OAuthClientToken(jwt, roles);
    }
}
