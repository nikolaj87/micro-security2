package com.nik.springoauthserver.service;

import com.nik.springoauthserver.entity.User;
import com.nik.springoauthserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserDetails> userByName = userRepository.findUserByUsername(username);
        if (userByName.isEmpty()) throw new UsernameNotFoundException("no such user " + userByName);
        return userByName.get();
    }
}
