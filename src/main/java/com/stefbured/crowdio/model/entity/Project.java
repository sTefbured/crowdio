package com.stefbured.crowdio.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creator_user_id")
    private User creator;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
