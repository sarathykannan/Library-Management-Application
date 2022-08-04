package com.Library.librarymanagement.repository;

import com.Library.librarymanagement.entity.booksborrowed;
import com.Library.librarymanagement.entity.borrowedtable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface borrowedtablerepository extends JpaRepository<borrowedtable,Integer> {



}
