package com.employee.management.service;

import com.employee.management.entity.Document;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Component
public interface DocumentService {
    Document saveDocument(MultipartFile file);
}

