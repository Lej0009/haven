package org.findhavens.app.service;

import org.findhavens.app.models.User;

public interface UserService {

    public void saveUser(User user);
    public boolean isUserAlreadyPresent(User user);
    public void changeUserPassword(User user, String password);
}
