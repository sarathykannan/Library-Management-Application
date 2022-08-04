package com.Library.librarymanagement.controller;

import com.Library.librarymanagement.entity.books;
import com.Library.librarymanagement.entity.borrowedbooks;
import com.Library.librarymanagement.entity.users;
import com.Library.librarymanagement.service.borrowedbooksservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class borrowedbookscontroller {
    @Autowired
    private borrowedbooksservice service;

    @PostMapping("/addborrowedbook")
    public borrowedbooks addborrowedbook(@RequestBody borrowedbooks book)

    {
        return service.addborrowedbook(book);
    }
    @PostMapping("/addborrowedbooks")
    public List<borrowedbooks> addborrowedbooks(@RequestBody List<borrowedbooks> book)

    {
        return service.addborrowedbooks(book);
    }
    @GetMapping("/getborrowedbooks")

    private List<borrowedbooks> getusers()
    {
        return service.getborrowedbooks();
    }

}

