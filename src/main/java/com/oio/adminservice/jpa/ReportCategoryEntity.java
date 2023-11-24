package com.oio.adminservice.jpa;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Getter
@Entity
@Table(name = "reportCategory")
public class ReportCategoryEntity {
    @Id
    @Column(name = "category_no")
    private Long categoryNo;

    @Column(nullable = false)
    private String name;

//    @OneToMany(mappedBy = "reportCategoryEntity")
//    private List<ReportEntity> reports;
}
