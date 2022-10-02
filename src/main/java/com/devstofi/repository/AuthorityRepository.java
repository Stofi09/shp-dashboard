package com.devstofi.repository;

import com.devstofi.dto.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority,Long> {
    Authority findByAuthority(String authority);
}
