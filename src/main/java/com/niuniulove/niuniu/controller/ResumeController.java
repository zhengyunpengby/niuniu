package com.niuniulove.niuniu.controller;

import com.niuniulove.niuniu.result.BasicResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: niuniu
 * @description: 简历
 * @author:
 * @create: 2019-05-10 14:32
 **/
@Slf4j
@RestController
@RequestMapping("/resume")
public class ResumeController {

    @RequestMapping("/list")
    public BasicResult list(){
        log.info("展示简历列表");
        BasicResult basicResult = BasicResult.newBasicResult();

        return basicResult;
    }
}
