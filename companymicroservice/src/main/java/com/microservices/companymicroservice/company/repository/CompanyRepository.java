package com.microservices.companymicroservice.company.repository;


import com.microservices.companymicroservice.company.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long > {
}
