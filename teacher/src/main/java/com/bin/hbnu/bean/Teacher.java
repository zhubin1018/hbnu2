package com.bin.hbnu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Bin1018
 * @Description TODO
 * @ClassName Teacher
 * @date 2020/2/4 9:59
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private Integer tid;
    private String tname;
    private String course;
    private String loginAccount;
    private String password;
}
