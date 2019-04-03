package com.shinsunyoung.springbootcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

}