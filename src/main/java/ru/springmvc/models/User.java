package ru.springmvc.models;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
=======
import javax.persistence.*;
>>>>>>> origin/main

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
<<<<<<< HEAD
=======

>>>>>>> origin/main
    private String email;
    @Column
    private int salary;

<<<<<<< HEAD
//    public User(String name, String surname, String email, int salary) {
//        this.name = name;
//        this.surname = surname;
//        this.email = email;
//        this.salary = salary;
//    }
=======
    public User(String name, String surname, String email, int salary) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.salary = salary;
    }
>>>>>>> origin/main

    public User() {
    }

<<<<<<< HEAD
//    public User(int id, String name, String surname, String email, int salary) {
//        this.id = id;
//        this.name = name;
//        this.surname = surname;
//        this.email = email;
//        this.salary = salary;
//    }
=======
    public User(int id, String name, String surname, String email, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.salary = salary;
    }
>>>>>>> origin/main

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}