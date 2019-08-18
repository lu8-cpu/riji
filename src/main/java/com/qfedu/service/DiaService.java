package com.qfedu.service;

import com.qfedu.entity.Dia;

import java.util.List;

public interface DiaService {
    List<Dia> find(Integer page, Integer limit);
}
