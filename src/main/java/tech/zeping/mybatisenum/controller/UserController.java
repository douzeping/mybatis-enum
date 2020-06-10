package tech.zeping.mybatisenum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.zeping.mybatisenum.dao.UserMapper;
import tech.zeping.mybatisenum.entity.User;
import tech.zeping.mybatisenum.pojo.request.UserRequest;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/add")
    public void add(UserRequest.AddUser request){
        User user = new User();
        user.setState(request.getUserState());
        user.setUsername("test11");
        userMapper.insert(user);
    }
}
