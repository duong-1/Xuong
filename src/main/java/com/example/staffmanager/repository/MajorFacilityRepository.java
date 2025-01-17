package com.example.staffmanager.repository;

import com.example.staffmanager.entity.MajorFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MajorFacilityRepository extends JpaRepository<MajorFacility, String> {
}
