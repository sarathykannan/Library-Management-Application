package com.Library.librarymanagement.service;

import com.Library.librarymanagement.entity.books;
import com.Library.librarymanagement.entity.borrowedbooks;
import com.Library.librarymanagement.entity.borrowedtable;
import com.Library.librarymanagement.repository.borrowedbooksrepository;
import com.Library.librarymanagement.repository.borrowedtablerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class borrowedtableservice {
    @Autowired
    private borrowedtablerepository repository;
    public borrowedtable addborrowedbook(borrowedtable book)
    {
        return   repository.save(book);
    }

    public List<borrowedtable> addborrowedbooks(List<borrowedtable> books)
    {
        return repository.saveAll(books);
    }

    public List<borrowedtable> getborrowedbooks(){
        return repository.findAll();
    }
    public borrowedtable update(borrowedtable book)
    {
        book.setStatus(false);
        return repository.save(book);

    }
}


