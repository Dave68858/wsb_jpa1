package com.jpacourse.persistence.dao.impl;

import com.jpacourse.persistence.dao.PatientDao;
import com.jpacourse.persistence.entity.PatientEntity;
import com.jpacourse.persistence.entity.VisitEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void addVisit(Long patientId, Long doctorName, LocalDateTime visitDate, String treatmentDescription) {
        PatientEntity patient = entityManager.find(PatientEntity.class, patientId);
        if (patient == null) {
            throw new IllegalArgumentException("Patient not found with ID: " + patientId);
        }

        VisitEntity visit = new VisitEntity();

        visit.setVisitDate(visitDate);
        visit.setPatient(patient);
        // Dodanie prostego opisu wizyty (rozbudowa możliwa w encji Visit)
        // Można dodać logikę tworzenia treatmentów i dodawania ich do wizyty

        patient.getVisits().add(visit);
        entityManager.merge(patient);


    }

    @Override
    public List<PatientEntity> findByLastName(String lastName) {
        TypedQuery<PatientEntity> query = entityManager.createQuery(
                "SELECT p FROM PatientEntity p WHERE p.lastName = :lastName", PatientEntity.class);
        query.setParameter("lastName", lastName);
        return query.getResultList();
    }

    @Override
    public List<PatientEntity> findByLEKI(String LEKI) {
        TypedQuery<PatientEntity> query = entityManager.createQuery(
                "select p from PatientEntity p " +
                        " join p.lekiEntity :LEKI", PatientEntity.class);
        query.setParameter("LEKI", LEKI);

        return query.getResultList();
    }


}
