package com.example.Library.repository;

import com.example.Library.model.Model_Library;
import org.apache.tomcat.jni.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repository_Library extends JpaRepository<Model_Library,Integer>{


}

