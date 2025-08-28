package com.Hospital.Management.System.doclogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital.Management.System.doclogin.entity.Medicine;

@Repository
public interface MedicineRepo extends JpaRepository<Medicine,Long>{

}
