package com.coh.service.impl;

import com.coh.dao.CupDao;
import com.coh.pojo.Cup;
import com.coh.service.CupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CupServiceImpl implements CupService {
    @Autowired
    private CupDao cupDao;
    public CupServiceImpl(CupDao cupDao){
        this.cupDao=cupDao;
    }

    public CupServiceImpl(){}

    public void setCupDao(CupDao cupDao) {
        this.cupDao = cupDao;
    }

    @Override
    public void save() {
        System.out.println("cupService.save");
        cupDao.countByExample(null);

    }

    @Override
    public List<Cup> findAll() {

        return cupDao.selectByExample(null);
    }
}
