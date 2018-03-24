package com.m4usta13ng.nikkacheck.app.service.index;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

@Service
@Transactional
public class IndexServiceImpl implements IndexService {

    @Override
    public Model initSetting(Model model) {
        model.addAttribute("hello", "hello world!");
        return model;
    }

}
