package com.example.template.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.template.models.MyTemplate;


public interface MyTemplateRepository extends JpaRepository<MyTemplate, Integer> {

}
