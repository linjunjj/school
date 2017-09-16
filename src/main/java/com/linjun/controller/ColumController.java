package com.linjun.controller;

import com.linjun.service.ColumService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("内容栏目管理")
@RestController
@RequestMapping(value = "/colum")
public class ColumController {
    @Autowired
    ColumService columService;




}
