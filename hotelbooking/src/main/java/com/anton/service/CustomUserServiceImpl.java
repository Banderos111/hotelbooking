package com.anton.service;

import com.anton.dao.entity.User;
import com.anton.dao.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomUserServiceImpl implements UserDetailsService {
    private final UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String firstName) throws UsernameNotFoundException {
        User loadedUser = repository.findUserByFirstName(firstName)
                .orElseThrow(() -> new UsernameNotFoundException("Can't find user by provided name!"));

        return new org.springframework.security.core.userdetails.User(loadedUser.getMail(), loadedUser.getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority(loadedUser.getRole().getName())));
    }
}
