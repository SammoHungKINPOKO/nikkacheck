package com.m4usta13ng.nikkacheck.app.controller.index;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m4usta13ng.nikkacheck.app.service.index.IndexService;

/**
 * TOP画面を表示するコントローラ
 * @author m4usta13ng
 * @version 0.01
 * @since 2018/03/25
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("")
public class IndexController {

    @Autowired
    IndexService indexService;

    /**
     * トップ画面へ遷移する。
     * @param model
     * @return トップ画面へ遷移
     */
    @RequestMapping(method = GET)
    public String index(Model model) {
        model = indexService.initSetting(model);
        return "index";
    }
}
