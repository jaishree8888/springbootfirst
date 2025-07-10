package com.example.springboot.repository;

import com.example.springboot.models.RegisterDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RegisterDetailsRepository extends JpaRepository<RegisterDetails,Integer> {

    boolean findByEmail()
}
