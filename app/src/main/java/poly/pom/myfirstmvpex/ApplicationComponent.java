package poly.pom.myfirstmvpex;

import javax.inject.Singleton;

import dagger.Component;
import poly.pom.myfirstmvpex.view.fragment.UserFragment;

/**
 * Created by User on 27/8/2016.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(UserFragment target);

}
