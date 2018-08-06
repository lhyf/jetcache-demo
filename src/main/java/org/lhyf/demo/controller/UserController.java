package org.lhyf.demo.controller;

import org.lhyf.demo.entity.TUser;
import org.lhyf.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/****
 * @author YF
 * @date 2018-08-03 09:54
 * @desc UserController
 *
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 1.在第一次调用此方法,正常获取数据,再次调用此方法时则发生异常
     *      java.lang.ClassCastException: org.lhyf.demo.entity.TUser cannot be cast to org.lhyf.demo.entity.TUser
     * 2.不适用此循环,直接将数据返回,则正常执行
     * 3.项目是用了 devtools
     *         <dependency>
     *             <groupId>org.springframework.boot</groupId>
     *             <artifactId>spring-boot-devtools</artifactId>
     *             <optional>true</optional>
     *         </dependency>
     * @return
     */
    @GetMapping("/list")
    public List<TUser> getAllUser(){
        List<TUser> list = userService.getAllUser();

        for(TUser user:list){
            // ...
            System.out.println(user);
        }

        return list;
    }

}
