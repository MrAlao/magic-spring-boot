package com.magic.springboot.controller;

import com.magic.springboot.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Created by chloneda
 * @Description:
 */
@Controller
@RestController
public class QueryController {

    @Autowired
    private QueryService queryService;

    @RequestMapping(value = "/doQuery", method = RequestMethod.GET)
    public List doQuery(String sql) {
        return queryService.doQuery(sql);
    }

}