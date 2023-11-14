package ru.itlearn.MyRestSpringBootAppH2DB.dao;

import org.springframework.stereotype.Repository;
import ru.itlearn.MyRestSpringBootAppH2DB.entity.AcademicDisciplines;

import java.util.List;

@Repository
public interface DisciplineServiceDAO {
    List<AcademicDisciplines> showAllDisciplines();

    AcademicDisciplines getDisciplines(int id);

    AcademicDisciplines saveDisciplines(AcademicDisciplines disciplines);

    void deleteDisciplines(int id);

}