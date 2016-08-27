package poly.pom.myfirstmvpex;

import android.app.Application;

/**
 * Created by User on 27/8/2016.
 */
public class MyApplication extends Application {
    private ApplicationComponent appComponent;

    public ApplicationComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }
}
