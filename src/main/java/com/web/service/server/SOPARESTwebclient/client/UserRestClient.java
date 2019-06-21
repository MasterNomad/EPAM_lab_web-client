package com.web.service.server.SOPARESTwebclient.client;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import user.wsdl.User;

@Service
public class UserRestClient implements IUserClient {

    private final String URL = "http://localhost:9191";
    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public User createUser(User user) {
        return restTemplate.postForObject(URL + "/createUser", user, User.class);
    }

    @Override
    public User readUser(int id) {
        return restTemplate.getForObject(URL + "/readUser/" + id, User.class);
    }

    @Override
    public User updateUser(User user) {
        restTemplate.put(URL+"/updateUser", user);
        return user;
    }

    @Override
    public boolean deleteUser(int id) {
        try {
            restTemplate.delete(URL + "/deleteUser/" + id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
