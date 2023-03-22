package com.sogeti.meetups.springsecoauth.oauthresourceserver.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

import java.util.Collection;

public class OAuthClientToken extends JwtAuthenticationToken {
    private  Jwt jwt;

    public OAuthClientToken(Jwt jwt, Collection<? extends GrantedAuthority> authorities) {
        super(jwt, authorities);
        this.jwt = jwt;
    }

    @Override
    public Object getPrincipal() {
        return this.jwt.getAudience().get(0);
    }
}
