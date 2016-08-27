package poly.pom.myfirstmvpex.presentation;

import poly.pom.myfirstmvpex.model.User;
import poly.pom.myfirstmvpex.repository.UserRepository;
import poly.pom.myfirstmvpex.view.Userview;

/**
 * Created by User on 27/8/2016.
 */
public class UserPresenterImpl implements UserPresenter {
    private Userview view;
    private UserRepository repository;

    public UserPresenterImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void setView(Userview view) {
        this.view = view;
    }

    @Override
    public void saveUser() {
        User user = new User(view.getUserName());
        if (user == null) {
            view.showFailToast();
        } else {
            repository.save(user);
            view.showSuccessToast();

        }


    }

    @Override
    public User loadUser() {
        return repository.getUser(0);
    }

    @Override
    public void resume() {
        User user = loadUser();
        view.displayUserName(user.getName());


    }

    @Override
    public void pause() {

    }
}
