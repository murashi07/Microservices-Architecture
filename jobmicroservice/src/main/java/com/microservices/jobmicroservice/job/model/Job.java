package com.microservices.jobmicroservice.job.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;
    // we change it because there's no Company Entity
//    @ManyToOne
//    private Company company;
    private Long companyId;

}
