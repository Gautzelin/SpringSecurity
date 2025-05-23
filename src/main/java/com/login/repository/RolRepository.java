package com.login.repository;

import com.login.entity.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<RolEntity, Long> {
       Optional<RolEntity> findByName(String name);
}
