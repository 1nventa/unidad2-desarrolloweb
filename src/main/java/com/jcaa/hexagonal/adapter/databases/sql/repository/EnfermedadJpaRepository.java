package com.jcaa.hexagonal.adapter.databases.sql.repository;


import com.jcaa.hexagonal.adapter.databases.sql.entity.EnfermedadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnfermedadJpaRepository extends JpaRepository<EnfermedadEntity, Long> {
}