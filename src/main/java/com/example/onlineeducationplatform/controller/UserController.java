package com.example.onlineeducationplatform.controller;

import com.example.onlineeducationplatform.dao.Result;
import com.example.onlineeducationplatform.dao.User;
import com.example.onlineeducationplatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    @ResponseBody
    @CrossOrigin
    public Result getUserById(@PathVariable int id) {
        User user = userService.getUserById(id);

        return Result.success(user);
    }

    @GetMapping
    @ResponseBody
    @CrossOrigin
    public Result<List<User>> getUserList() {
        List<User> users = userService.getUserList();
        System.out.println(users.size());
        System.out.println(users.get(0).getName());
        return Result.success(users);
    }

    @PostMapping("/add")  // 修改路径以避免冲突
    @CrossOrigin
    public Result addUser(@RequestBody User user) {
        // 添加用户逻辑
        return Result.success("用户添加成功");
    }

    @PostMapping("/update")  // 修改路径以避免冲突
    @CrossOrigin
    public Result updateUser(@RequestBody User user) {
        // 更新用户逻辑
        return Result.success("用户更新成功");
    }

    @DeleteMapping
    @CrossOrigin
    public Result deleteUser(@RequestBody User user) {
        System.out.println(user.getName());
        userService.delete(user.getId());
        return Result.success("成功");
    }
}

