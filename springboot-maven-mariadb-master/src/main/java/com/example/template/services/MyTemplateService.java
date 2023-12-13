package com.example.template.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.template.models.MyTemplate;
import com.example.template.repositories.MyTemplateRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class MyTemplateService {

    @Autowired
    MyTemplateRepository repository;


    public List<MyTemplate> findAll() {
        return repository.findAll();
    }
}
