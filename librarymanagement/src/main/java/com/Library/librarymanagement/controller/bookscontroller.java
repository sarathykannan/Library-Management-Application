package com.Library.librarymanagement.controller;

import com.Library.librarymanagement.entity.books;
import com.Library.librarymanagement.entity.booksborrowed;
import com.Library.librarymanagement.entity.user;
import com.Library.librarymanagement.repository.booksrepository;
import com.Library.librarymanagement.service.bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class bookscontroller {
    @Autowired
    private bookservice service;

    @PostMapping("/addbook")

    public books addbook(@RequestBody books book)
    {
        return service.addbook(book);
    }
    @PostMapping("/addbooks")

    public List<books> addbooks(@RequestBody List<books> book)
    {
        return service.addbooks(book);
    }
    @GetMapping("/getbooks")

    public List<books> findallbooks()
    {
        return service.getBooks();
    }
    @GetMapping("getbookbyid/{id}")

    public books findbookbyid(@PathVariable int id)
    {
        return service.getBooksbyId(id);
    }

    @DeleteMapping("/deletebook/{bookid}")
    public void deletebook(@PathVariable int bookid)
    {
        service.deletebook(bookid);

    }
    @GetMapping("/findbybookname")
    public books findbybookname(@RequestBody books books) throws Exception
    {
        String bookname=books.getBookname();
        books obj=new books();
        if(bookname!=null)
        {
            obj = service.fetchbookbyname(bookname);
        }
        if(obj==null)
        {
            throw new Exception("book doesnt exist");
        }
        return obj;
    }
    @PutMapping("/updatebook")
    public books updatebook(@RequestBody books books)
    {
        return service.updatebooks(books);

    }
    @PutMapping("/updatebooks/{id}")
    @CrossOrigin(origins="http://localhost:4200")
    public books update(@PathVariable int id)
    {
        return service.update(id);
    }


}
