package com.m4usta13ng.nikkacheck.app.service.index;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

/**
 *
 * @author m4usta13ng
 *
 */
@Service
@Transactional
public interface IndexService {

    /**
     *
     * @param model
     * @return
     */
    public Model initSetting(Model model);
}
