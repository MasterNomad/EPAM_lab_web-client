package com.web.service.server.SOPARESTwebclient.controller;

import com.web.service.server.SOPARESTwebclient.client.IUserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import user.wsdl.User;

@RestController
public class UserController implements IUserClient {

    @Autowired
    private IUserClient userClient;

    @Override
    @PostMapping("/createUser")
    public User createUser(User user) {
        return userClient.createUser(user);
    }

    @Override
    @GetMapping("/getUser/{id}")
    public User readUser(@PathVariable int id) {
        return userClient.readUser(id);
    }

    @Override
    @PutMapping("/updateUser")
    public User updateUser(User user) {
        return userClient.updateUser(user);
    }

    @Override
    @DeleteMapping("/deleteUser/{id}")
    public boolean deleteUser(@PathVariable int id) {
        return userClient.deleteUser(id);
    }
}
