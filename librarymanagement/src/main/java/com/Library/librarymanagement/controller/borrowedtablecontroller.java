package com.Library.librarymanagement.controller;

import com.Library.librarymanagement.entity.books;
import com.Library.librarymanagement.entity.booksborrowed;
import com.Library.librarymanagement.entity.borrowedtable;
import com.Library.librarymanagement.repository.booksrepository;
import com.Library.librarymanagement.repository.borrowedtablerepository;
import com.Library.librarymanagement.service.borrowedtableservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class borrowedtablecontroller {
    @Autowired
    private borrowedtableservice service;
    @Autowired
    private borrowedtablerepository repository;

    @PostMapping("/addborrowedtable")
    public borrowedtable addborrowedbook(@RequestBody borrowedtable book)

    {
        return service.addborrowedbook(book);
    }
    @PostMapping("/addborrowedtables")
    public List<borrowedtable> addborrowedbooks(@RequestBody List<borrowedtable> book)

    {
        return service.addborrowedbooks(book);
    }
    @GetMapping("/getborrowedtables")

    private List<borrowedtable> getusers()
    {
        return service.getborrowedbooks();
    }
    @PutMapping("/updateborrowedbooks")
    @CrossOrigin(origins="http://localhost:4200")
    public borrowedtable update(@RequestBody borrowedtable book)
    {
        return service.update(book);
    }




}
