package com.techcushy.dataBase.controller;

import com.techcushy.dataBase.model.Users;
import com.techcushy.dataBase.repositiory.UserRepositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping(value="/rest/users")
public class UserController {

    @Autowired
    private UserRepositiory userRepositiory;

    @GetMapping("/all")
    public List<Users> getAll(){
         return userRepositiory.findAll();
    }

    @PostMapping(value="/load")
    public List<Users> persist(@RequestBody final Users users){
       userRepositiory.save(users);
       return userRepositiory.findAll();
    }
}
