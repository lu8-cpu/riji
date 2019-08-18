package com.qfedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.qfedu.dao.DiaDao;

import com.qfedu.entity.Dia;
import com.qfedu.service.DiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiaServiceImpl implements DiaService {
    @Autowired
    private DiaDao diaDao;
    @Override
    public List<Dia> find(Integer page, Integer limit) {


        PageHelper.startPage(page, limit);
        List<Dia> diaList = diaDao.find();
        return diaList;
    }
}
