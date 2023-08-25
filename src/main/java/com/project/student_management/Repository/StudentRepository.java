package com.project.student_management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.qos.logback.core.joran.event.SaxEvent;

public interface StudentRepository extends JpaRepository<SaxEvent,Integer> {
    
}
