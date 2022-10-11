package com.devstofi.repository;

import com.devstofi.dto.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.List;


@Configuration
public interface UserRepository extends JpaRepository <User,Long >{
    List<User> findAll();
    User findByUserName(String userName);
}
