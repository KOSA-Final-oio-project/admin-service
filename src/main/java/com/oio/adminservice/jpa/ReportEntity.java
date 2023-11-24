package com.oio.adminservice.jpa;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Getter
@Entity
@Table(name = "report")
public class ReportEntity {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportNo;

    @ManyToOne
    @JoinColumn(name = "category_no")
    private ReportCategoryEntity reportCategoryEntity;

    @Email
    @Column(nullable = false)
    private String reporterEmail;

    @Email
    @Column(nullable = false)
    private String reportedEmail;


    @Column(nullable = false)
    private String content;
}
