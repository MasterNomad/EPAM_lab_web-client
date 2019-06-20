package com.web.service.server.SOPARESTwebclient.client;

import user.wsdl.User;

public interface IUserClient {

    User createUser (User user);
    User readUser (int id);
    User updateUser (User user);
    boolean deleteUser (int id);

}
