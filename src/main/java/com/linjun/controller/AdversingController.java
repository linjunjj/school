package com.linjun.controller;

import com.linjun.service.AdvertingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/adversing")
@Api("广告管理")
@RestController
public class AdversingController {
    @Autowired
    AdvertingService advertingService;
//@ApiOperation(value = "")



}
