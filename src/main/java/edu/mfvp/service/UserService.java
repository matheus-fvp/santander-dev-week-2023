package edu.mfvp.service;

import edu.mfvp.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);

}
