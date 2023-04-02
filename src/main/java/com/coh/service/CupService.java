package com.coh.service;

import com.coh.pojo.Cup;

import java.util.List;

public interface CupService {
    void save();
    List<Cup> findAll();
}
