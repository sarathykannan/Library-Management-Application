package com.Library.librarymanagement.repository;

import com.Library.librarymanagement.entity.borrowedbooks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface borrowedbooksrepository extends JpaRepository<borrowedbooks, Integer> {

}
