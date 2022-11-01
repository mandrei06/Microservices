package com.practicingMicroservices.Microservices.repository;

import com.practicingMicroservices.Microservices.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company,Integer> {
}
