package com.m4usta13ng.nikkacheck.app.service.nikka;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author m4usta13ng
 *
 */
@Service
@Transactional
public interface BeginNikkaService {

    /**
     *
     * @param userID
     * @return
     */
    public List<String> loadQuestions(String userID);
}
