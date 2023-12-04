package com.hugorplobo.myshelf.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "edition")
public class Edition {

    @Id
    private String ISBN;

    private Integer pages;

    @Temporal(TemporalType.DATE)
    private Date publishDate;

    private String publisher;

    private String language;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private Book book;
}
