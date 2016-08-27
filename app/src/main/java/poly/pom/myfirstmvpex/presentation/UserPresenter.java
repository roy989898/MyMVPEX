package poly.pom.myfirstmvpex.presentation;

import poly.pom.myfirstmvpex.model.User;
import poly.pom.myfirstmvpex.view.Userview;

/**
 * Created by User on 27/8/2016.
 */
public interface UserPresenter extends LifecylePresenter {
    void setView(Userview view);
    void saveUser();
    User loadUser();
}
