package com.Library.librarymanagement.service;

import com.Library.librarymanagement.entity.borrowedbooks;
import com.Library.librarymanagement.repository.borrowedbooksrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class borrowedbooksservice {

    @Autowired
    private borrowedbooksrepository repository;
    public borrowedbooks addborrowedbook(borrowedbooks book)
    {
        return   repository.save(book);
    }

    public List<borrowedbooks> addborrowedbooks(List<borrowedbooks> books)
    {
        return repository.saveAll(books);
    }

    public List<borrowedbooks> getborrowedbooks(){
        return repository.findAll();
    }
}
