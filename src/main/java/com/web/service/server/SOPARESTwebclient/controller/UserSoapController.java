package com.web.service.server.SOPARESTwebclient.controller;

import com.web.service.server.SOPARESTwebclient.client.IUserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import user.wsdl.User;

@RestController
public class UserSoapController implements IUserClient {

   @Autowired
    private IUserClient userSoapClient;

    @Override
    @PostMapping("/createUserSOAP")
    public User createUser(User user) {
        return userSoapClient.createUser(user);
    }

    @Override
    @GetMapping("/getUserSOAP/{id}")
    public User readUser(@PathVariable int id) {
        return userSoapClient.readUser(id);
    }

    @Override
    @PutMapping("/updateUserSOAP")
    public User updateUser(User user) {
        return userSoapClient.updateUser(user);
    }

    @Override
    @DeleteMapping("/deleteUserSOAP/{id}")
    public boolean deleteUser(@PathVariable int id) {
        return userSoapClient.deleteUser(id);
    }
}
