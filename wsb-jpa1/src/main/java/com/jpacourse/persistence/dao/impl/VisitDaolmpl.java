package com.jpacourse.persistence.dao.impl;

import com.jpacourse.persistence.dao.VisitDao;
import com.jpacourse.persistence.entity.VisitEntity;

import org.springframework.stereotype.Repository;

@Repository
public class VisitDaolmpl extends AbstractDao<VisitEntity, Long> implements VisitDao {
}
