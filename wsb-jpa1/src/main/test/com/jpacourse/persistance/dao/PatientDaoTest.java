package com.jpacourse.persistance.dao;

import com.jpacourse.persistence.dao.PatientDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

@DataJpaTest
public class PatientDaoTest {

    @Autowired
    private PatientDao patientDao;


    @Test
    @Transactional
    public void testFindByLekiName() {

    }

    /**
     * Test usuwania pacjenta i sprawdzenia kaskadowego usuwania wizyt.
     */

}
