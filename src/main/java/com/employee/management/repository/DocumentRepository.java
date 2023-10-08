package com.employee.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.management.entity.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{

	
}
