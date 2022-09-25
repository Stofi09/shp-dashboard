package com.devstofi.service;

import com.devstofi.dto.Authority;
import com.devstofi.dto.User;
import com.devstofi.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.devstofi.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private AuthorityRepository authRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Authority auth2 = authRepo.findByAuthority("ROLE_ADMIN");
        User user = new User();
        user.setUserName("user");
        user.setPassword(passwordEncoder2().encode("user"));
        user.setId(50L);
        user.setAuthority(auth2);
        System.out.println(user.getAuthorities());
        return (UserDetails) user;
    }

    @Bean
    PasswordEncoder passwordEncoder2(){
        return new BCryptPasswordEncoder();
    }

}
