package com.microservices.jobmicroservice.job.repository;

import com.microservices.jobmicroservice.job.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
