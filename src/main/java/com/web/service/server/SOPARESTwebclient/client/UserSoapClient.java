package com.web.service.server.SOPARESTwebclient.client;

import com.web.service.server.SOPARESTwebclient.connector.SOAPConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import user.wsdl.*;

@Repository
public class UserSoapClient implements IUserClient {

    private final String URI = "http://localhost:9191/soap";
    @Autowired
    private SOAPConnector connector;

    @Override
    @CachePut(value = "users", key = "#user.id")
    public User createUser(User user) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUser(user);
        CRUUserResponse response = (CRUUserResponse) connector.callWebService(URI, request);
        return response.getUser();
    }

    @Override
    //@Cacheable("users")
    public User readUser(int id) {
        ReadUserRequest request = new ReadUserRequest();
        request.setId(id);
        CRUUserResponse response = (CRUUserResponse) connector.callWebService(URI, request);
        return response.getUser();
    }

    @Override
    @CachePut(value = "users", key = "#user.id")
    public User updateUser(User user) {
        UpdateUserRequest request = new UpdateUserRequest();
        request.setUser(user);
        CRUUserResponse response = (CRUUserResponse) connector.callWebService(URI, request);
        return response.getUser();
    }

    @Override
    @CacheEvict("users")
    public boolean deleteUser(int id) {
        DeleteUserRequest request = new DeleteUserRequest();
        request.setId(id);
        DeleteUserResponse response = (DeleteUserResponse) connector.callWebService(URI, request);
        return response.isStatus();
    }
}
