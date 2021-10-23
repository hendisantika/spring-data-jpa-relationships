package com.hendisantika.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.awt.print.Book;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-data-jpa-relationships
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/10/21
 * Time: 08.00
 */
@Data
@Entity
@Table(name = "photo")
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Long id;

    private String urlSmall;
    private String urlMedium;
    private String urlLarge;

    @OneToOne(mappedBy = "photo")
    private Book book;
}
