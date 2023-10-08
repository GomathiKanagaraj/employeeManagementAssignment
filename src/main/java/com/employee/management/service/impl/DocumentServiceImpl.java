package com.employee.management.service.impl;

import antlr.StringUtils;
import com.employee.management.entity.Document;
import com.employee.management.repository.DocumentRepository;
import com.employee.management.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


@Component
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    DocumentRepository documentRepository;
    @Override
    public Document saveDocument(MultipartFile file) {

//        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        return null;
    }
}
