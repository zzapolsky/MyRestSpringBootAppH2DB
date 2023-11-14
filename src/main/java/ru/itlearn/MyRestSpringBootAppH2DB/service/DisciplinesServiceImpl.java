package ru.itlearn.MyRestSpringBootAppH2DB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itlearn.MyRestSpringBootAppH2DB.dao.DisciplineServiceDAO;
import ru.itlearn.MyRestSpringBootAppH2DB.entity.AcademicDisciplines;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DisciplinesServiceImpl implements DisciplinesService{
    @Autowired
    private DisciplineServiceDAO disciplineServiceDAO;
    @Override
    @Transactional
    public List<AcademicDisciplines> showAllDisciplines() {
        return disciplineServiceDAO.showAllDisciplines();
    }

    @Override
    @Transactional
    public AcademicDisciplines saveDisciplines(AcademicDisciplines academicDisciplines) {
        return disciplineServiceDAO.saveDisciplines(academicDisciplines);
    }

    @Override
    @Transactional
    public AcademicDisciplines getDisciplines(int id) {
        return disciplineServiceDAO.getDisciplines(id);
    }

    @Override
    @Transactional
    public void deleteDisciplines(int id) {
        disciplineServiceDAO.deleteDisciplines(id);
    }
}