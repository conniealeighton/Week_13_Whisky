package com.Whisky.whiskyservice.repositories.WhiskyRepository;


import com.Whisky.whiskyservice.models.Distillery;
import com.Whisky.whiskyservice.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class WhiskyRepositoryImpl implements WhiskyRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Whisky> getWhiskyFromACetainYear(int year) {
        List<Whisky> whiskies = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Whisky.class);
            cr.add(Restrictions.eq("year", year));
            whiskies = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return whiskies;
    }

    @Transactional
    public List<Whisky> getWhiskyFromACetainRegion(String region){
        List<Whisky> whiskies = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Whisky.class);
            cr.add(Restrictions.eq("region", region));
            whiskies = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return whiskies;
    }

    @Transactional
    public List<Distillery> getAll12YearOldWhisky(Distillery distillery){
        List<Distillery> distilleries = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Distillery.class);
            cr.add(Restrictions.eq("distillary", distillery));
            distillery = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return distilleries;
    }

}


