package com.shinsunyoung.springbootcrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Person{
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String password;

}