package com.web.service.server.SOPARESTwebclient.client;

import com.web.service.server.SOPARESTwebclient.connector.SOAPConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import user.wsdl.*;

import java.math.BigInteger;

@Repository
public class UserClient implements IUserClient {

    @Autowired
    private SOAPConnector connector;

    private final String URI = "http://localhost:9191/soap";

    @Override
    public boolean createUser(User user) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUser(user);
        CreateUserResponse response = (CreateUserResponse)connector.callWebService(URI, request);
        return response.isStatus();
    }

    @Override
    public User readUser(int id) {
        ReadUserRequest request = new ReadUserRequest();
        request.setId(BigInteger.valueOf(id));
        ReadUserResponse response = (ReadUserResponse) connector.callWebService(URI, request);
        return response.getUser();
    }

    @Override
    public boolean updateUser(User user) {
        UpdateUserRequest request = new UpdateUserRequest();
        request.setUser(user);
        UpdateUserResponse response = (UpdateUserResponse)connector.callWebService(URI, request);
        return response.isStatus();
    }

    @Override
    public boolean deleteUser(int id) {
        DeleteUserRequest request = new DeleteUserRequest();
        request.setId(BigInteger.valueOf(id));
        DeleteUserResponse response = (DeleteUserResponse) connector.callWebService(URI, request);
        return response.isStatus();
    }
}
