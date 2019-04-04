package com.pet.aki.sec.domain;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class Member implements UserDetails {

    private static final long serialVersionUID = 1L;

    private String username;
    private String password;
    private String memberName;
    private final boolean accountNonExpired;
    private final boolean accountNonLocked;
    private final boolean credentialsNonExpired;
    private boolean enabled;
    private Collection<? extends GrantedAuthority> authorities;


    public Member() {

        this.accountNonExpired = true;
        this.accountNonLocked = true;
        this.credentialsNonExpired = true;
    }


    @Override
    public String getUsername() {

        return this.username;
    }


    public void setUsername(String username) {

        this.username = username;
    }


    @Override
    public String getPassword() {

        return this.password;
    }


    public void setPassword(String password) {

        this.password = password;
    }


    public String getMemberName() {

        return this.memberName;
    }


    public void setMemberName(String memberName) {

        this.memberName = memberName;
    }


    @Override
    public boolean isAccountNonExpired() {

        return this.accountNonExpired;
    }


    @Override
    public boolean isAccountNonLocked() {

        return this.accountNonLocked;
    }


    @Override
    public boolean isCredentialsNonExpired() {

        return this.credentialsNonExpired;
    }


    @Override
    public boolean isEnabled() {

        return this.enabled;
    }


    public void setEnabled(boolean enabled) {

        this.enabled = enabled;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return authorities;
    }


    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {

        this.authorities = authorities;
    }
}
