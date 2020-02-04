package com.bin.hbnu.controller;

import com.bin.hbnu.bean.Teacher;
import com.bin.hbnu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author Bin1018
 * @Description TODO
 * @ClassName TestController
 * @date 2020/2/4 9:29
 **/
@Controller
public class TestController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/test")
    public String test(Map map){
        Teacher teacher = teacherService.testById(2);
        map.put("teacher",teacher);
        return "test";
    }
}
