package com.searchengine.searchEngine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @Autowired
    private SearchService service;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String greeting() {
        return service.search();
    }
}
