package com.Library.librarymanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class booksborrowed {
    private int bookid;
    private String bookname;
    private Date issuedate;
    private Date duedate;
    private Date returndate;

    private boolean status;
}
