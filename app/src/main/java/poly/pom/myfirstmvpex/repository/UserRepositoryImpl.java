package poly.pom.myfirstmvpex.repository;

import poly.pom.myfirstmvpex.model.User;

/**
 * Created by User on 27/8/2016.
 */
public class UserRepositoryImpl implements UserRepository {

    private User user = new User("Tom");

    @Override
    public User getUser(int id) {
        return user;
    }

    @Override
    public void save(User u) {
        this.user = u;
    }
}
