package com.stefbured.crowdio.repository;

import com.stefbured.crowdio.model.entity.StaticInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticInformationRepository extends JpaRepository<StaticInformation, Integer> {
}
