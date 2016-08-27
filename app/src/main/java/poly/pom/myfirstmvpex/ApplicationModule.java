package poly.pom.myfirstmvpex;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import poly.pom.myfirstmvpex.presentation.UserPresenter;
import poly.pom.myfirstmvpex.presentation.UserPresenterImpl;
import poly.pom.myfirstmvpex.repository.UserRepository;
import poly.pom.myfirstmvpex.repository.UserRepositoryImpl;

/**
 * Created by User on 27/8/2016.
 */
@Module
public class ApplicationModule {
    Context context;

    public ApplicationModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    UserRepository provideRepository() {
        return new UserRepositoryImpl();
    }

    @Provides
    UserPresenter provideUserPresenter(UserRepository repository){
        return  new UserPresenterImpl(repository);
    }

}
