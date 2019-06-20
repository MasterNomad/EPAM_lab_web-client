package com.web.service.server.SOPARESTwebclient.client;

import user.wsdl.User;

public interface IUserClient {

    boolean createUser (User user);
    User readUser (int id);
    boolean updateUser (User user);
    boolean deleteUser (int id);

}
