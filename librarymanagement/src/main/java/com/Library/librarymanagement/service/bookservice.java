package com.Library.librarymanagement.service;

import com.Library.librarymanagement.entity.books;
import com.Library.librarymanagement.repository.booksrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class bookservice {

    @Autowired
    private booksrepository repository;

    public books addbook(books book)
    {
      return   repository.save(book);
    }
    public List<books> addbooks(List<books> books)
    {
        return repository.saveAll(books);
    }

    public List<books> getBooks()
    {
        return repository.findAll();
    }
    public books getBooksbyId(int id)
    {
        return repository.findById(id).orElse(null);

    }
//   public books updatebook(books books)
//   {
//       return repository.update(books);
//   }
    public books fetchbookbyname(String bookname)
    {
        return repository.findByBookname(bookname);
    }

    public void deletebook(int bookid)
    {
         repository.deleteById(bookid);

    }
    public books updatebooks(books book)
    {
        books existing=repository.findById(book.getBookid()).orElse(null);
        return repository.save(book);

    }
    public books update(int id)
    {
        books b=repository.findById(id).orElse(null);
        b.setCount(b.getCount()+1);
        System.out.println(b);
        return repository.save(b);

    }





}
