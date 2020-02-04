package com.bin.hbnu.service.impl;

import com.bin.hbnu.bean.Teacher;
import com.bin.hbnu.mappers.TeacherMapper;
import com.bin.hbnu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Bin1018
 * @Description TODO
 * @ClassName TeacherServiceImpl
 * @date 2020/2/4 9:43
 **/
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    public Teacher testById(int i) {
        return teacherMapper.testById(i);
    }
}
