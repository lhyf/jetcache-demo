package org.lhyf.demo.service;

import org.lhyf.demo.entity.TUser;

import java.util.List;

/****
 * @author YF
 * @date 2018-08-03 09:55
 * @desc UserService
 *
 **/
public interface UserService {
    List<TUser> getAllUser(TUser user);
    void delet(TUser user);
    void delet2(TUser user);
}
