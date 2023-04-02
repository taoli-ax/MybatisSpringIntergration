package com.coh.dao.impl;

import com.coh.dao.CupDao;
import com.coh.pojo.Cup;
import com.coh.pojo.CupExample;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CupDaoImpl implements CupDao {

    @Override
    public long countByExample(CupExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(CupExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Cup record) {
        return 0;
    }

    @Override
    public int insertSelective(Cup record) {
        return 0;
    }

    @Override
    public List<Cup> selectByExample(CupExample example) {
        return null;
    }

    @Override
    public Cup selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Cup record, CupExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Cup record, CupExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Cup record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Cup record) {
        return 0;
    }
}
