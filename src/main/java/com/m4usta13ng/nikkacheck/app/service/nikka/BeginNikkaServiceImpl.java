package com.m4usta13ng.nikkacheck.app.service.nikka;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BeginNikkaServiceImpl implements BeginNikkaService {

    private static final String DUMMY_QUESTION_0 = "今日は歯磨きをしましたか？";
    private static final String DUMMY_QUESTION_1 = "早寝早起きをしましたか？";

    /**
     *
     */
    @Override
    public List<String> loadQuestions(String userID) {
        List<String> questionList = new ArrayList<String>();
        questionList.add(DUMMY_QUESTION_0);
        questionList.add(DUMMY_QUESTION_1);
        return questionList;
    }

}
