package ru.itlearn.MyRestSpringBootAppH2DB.service;

import org.springframework.stereotype.Service;
import ru.itlearn.MyRestSpringBootAppH2DB.entity.AcademicDisciplines;

import java.util.List;

@Service
public interface DisciplinesService {
    List<AcademicDisciplines> showAllDisciplines();

    AcademicDisciplines saveDisciplines(AcademicDisciplines academicDisciplines);

    AcademicDisciplines getDisciplines(int id);

    void deleteDisciplines(int id);
}