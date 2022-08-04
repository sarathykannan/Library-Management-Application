package com.Library.librarymanagement.repository;

import com.Library.librarymanagement.entity.books;
import com.Library.librarymanagement.entity.booksborrowed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface booksrepository extends JpaRepository<books, Integer> {
public books findByBookname(String bookname);


}
