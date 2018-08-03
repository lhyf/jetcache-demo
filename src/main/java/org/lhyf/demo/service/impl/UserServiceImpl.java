package org.lhyf.demo.service.impl;

import com.alicp.jetcache.anno.Cached;
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
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TUserMapper userMapper;


    @Cached(name = "users")
    @Override
    public List<TUser> getAllUser() {
        List<TUser> list = userMapper.selectByExample(null);
        return list;
    }
}
