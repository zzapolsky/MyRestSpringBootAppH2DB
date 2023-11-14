package ru.itlearn.MyRestSpringBootAppH2DB.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.itlearn.MyRestSpringBootAppH2DB.entity.AcademicDisciplines;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
@Slf4j
public class DisciplineServiceDAOImpl implements DisciplineServiceDAO {
    @Autowired
    EntityManager entityManager;
    @Override
    public List<AcademicDisciplines> showAllDisciplines() {
        Query query = entityManager.createQuery("from AcademicDisciplines");
        List<AcademicDisciplines> showAllDisciplines = query.getResultList();
        log.info("allDisciplines", showAllDisciplines);
        return showAllDisciplines;
    }

    @Override
    public AcademicDisciplines getDisciplines(int id) {
        return entityManager.find(AcademicDisciplines.class, id);
    }

    @Override
    public AcademicDisciplines saveDisciplines(AcademicDisciplines disciplines) {
        return entityManager.merge(disciplines);
    }

    @Override
    public void deleteDisciplines(int id) {
        Query query = entityManager.createQuery("delete from AcademicDisciplines " +
                "where id =: disciplinesId");
        query.setParameter("disciplinesId", id);
        query.executeUpdate();
    }
}