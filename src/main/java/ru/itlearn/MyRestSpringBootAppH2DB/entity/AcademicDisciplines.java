package ru.itlearn.MyRestSpringBootAppH2DB.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "ACADEMIC_DISCIPLINES")
public class AcademicDisciplines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;


    public AcademicDisciplines(){}

    public AcademicDisciplines(String name) {
        this.name = name;

    }
}