package com.Library.librarymanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tableofbooks")
public class books {
    @Id
    @GeneratedValue
    private int bookid;
    private String bookname;
    private String authorname;
    private int count;
    public boolean status;

}
