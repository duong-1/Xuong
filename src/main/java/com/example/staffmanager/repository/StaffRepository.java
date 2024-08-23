package com.example.staffmanager.repository;

import com.example.staffmanager.entity.Staff;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, String> {
    @Modifying
    @Transactional
    @Query("UPDATE Staff SET status = :status WHERE id = :id")
    void updateStatus(String id, int status);

    boolean existsByAccountFe(String accountFe);

    boolean existsByAccountFpt(String accountFpt);

    boolean existsByStaffCode(String staffCode);
}
