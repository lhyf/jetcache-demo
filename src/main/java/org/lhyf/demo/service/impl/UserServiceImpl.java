package org.lhyf.demo.service.impl;

import org.lhyf.cache.annotation.CacheEvict;
import org.lhyf.cache.annotation.CachePut;
import org.lhyf.cache.annotation.Cached;
import org.lhyf.demo.entity.TUser;
import org.lhyf.demo.mapper.TUserMapper;
import org.lhyf.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/****
 * @author YF
 * @date 2018-08-03 09:56
 * @desc UserServiceImpl
 *
 **/
@Service(value = "userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private TUserMapper userMapper;



    @Cached(key = "'getallUser:'+#user.username")
    public List<TUser> getAllUser(TUser user) {
        List<TUser> list = userMapper.selectByExample(null);
        return list;
    }

    @CacheEvict(key = "'getallUser*'",allKey = true)
    public void delet(TUser user) {

    }

    @CacheEvict(key = "'getallUser*'")
    @Override
    public void delet2(TUser user) {

    }
}
