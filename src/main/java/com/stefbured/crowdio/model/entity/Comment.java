package com.stefbured.crowdio.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "value")
    private String value;

    @ManyToOne
    @JoinColumn(name = "author_user_id")
    private User author;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
}
