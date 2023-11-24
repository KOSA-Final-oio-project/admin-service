package com.oio.adminservice.jpa;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "admin")
public class AdminEntity {
    @Id
    private String id;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String encryptedPwd;
}
