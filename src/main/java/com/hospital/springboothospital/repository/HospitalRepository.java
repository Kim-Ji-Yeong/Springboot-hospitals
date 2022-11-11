package com.hospital.springboothospital.repository;

import com.hospital.springboothospital.domain.dto.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital,Integer> {
}