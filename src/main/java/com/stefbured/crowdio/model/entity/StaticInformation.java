package com.stefbured.crowdio.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "static_information")
public class StaticInformation {
    @Id
    @Column(name = "key_string")
    private String key;

    @Column(name = "value")
    private String value;
}
