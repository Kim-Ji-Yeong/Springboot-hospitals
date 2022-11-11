package com.hospital.springboothospital.domain.dto;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Entity
@Table(name = "nation_wide_hospitals")
public class Hospital {
    @Id
    private Integer id;
}
