package com.m4usta13ng.nikkacheck.app.controller.nikka;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m4usta13ng.nikkacheck.app.service.nikka.BeginNikkaService;

/**
 * nikkacheckを行うコントローラ
 * @author m4usta13ng
 * @version 0.01
 * @since 2018/03/25
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/nikka")
public class NikkaController {

    private static final String DUMMY_USER_ID = "DUMMY";

    @Autowired
    BeginNikkaService beginNikkaService;

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(method = GET, value = "begin")
    public String beginNikka(Model model) {
        model.addAttribute("message", "let's do nikka, okay?");
        model.addAttribute("formHeader", "Questions:");
        model.addAttribute("questions", beginNikkaService.loadQuestions(DUMMY_USER_ID));
        return "nikka/nikka";
    }

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(method = POST, value = "execute")
    public String executeNikka(Model model) {
        return "index";
    }
}
