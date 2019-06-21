package com.web.service.server.SOPARESTwebclient.controller;

import com.web.service.server.SOPARESTwebclient.client.IUserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import user.wsdl.User;

@RestController
public class UserRestController implements IUserClient {

    @Autowired
    private IUserClient userRestClient;

    @Override
    @PostMapping("/createUserREST")
    public User createUser(User user) {
        return userRestClient.createUser(user);
    }

    @Override
    @GetMapping("/getUserREST/{id}")
    public User readUser(@PathVariable int id) {
        return userRestClient.readUser(id);
    }

    @Override
    @PutMapping("/updateUserREST")
    public User updateUser(User user) {
        return userRestClient.updateUser(user);
    }

    @Override
    @DeleteMapping("/deleteUserREST/{id}")
    public boolean deleteUser(@PathVariable int id) {
        return userRestClient.deleteUser(id);
    }
}
