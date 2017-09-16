package com.linjun.controller;

import com.linjun.service.ContentitemService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("内容项管理")
@RestController
@RequestMapping(value = "/contentltem")
public class ContentltemController {
    @Autowired
    ContentitemService contentitemService;


}
