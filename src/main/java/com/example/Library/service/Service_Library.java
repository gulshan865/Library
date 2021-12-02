package com.example.Library.service;

import com.example.Library.model.Model_Library;
import com.example.Library.repository.Repository_Library;
import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Service_Library {

    @Autowired
    private Repository_Library repositoryLibrary;

    public void add(Model_Library lib){
        repositoryLibrary.save(lib);
    }

    public List<Model_Library> get1(){
        return repositoryLibrary.findAll();
    }

    public Model_Library getbyid(int id){
        Optional<Model_Library> book = repositoryLibrary.findById(id);
        if(book.isPresent()){
            return book.get();
        }
        return null;
    }

    public void delete(int id){
        repositoryLibrary.deleteById(id);
    }

}
