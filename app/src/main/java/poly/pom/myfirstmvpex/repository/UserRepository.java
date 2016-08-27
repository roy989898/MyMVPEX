package poly.pom.myfirstmvpex.repository;

import poly.pom.myfirstmvpex.model.User;

/**
 * Created by User on 27/8/2016.
 */
public interface UserRepository {
    User getUser(int id);
    void save(User u);
}

