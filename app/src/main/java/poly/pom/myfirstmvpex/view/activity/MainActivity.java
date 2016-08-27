package poly.pom.myfirstmvpex.view.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import poly.pom.myfirstmvpex.R;
import poly.pom.myfirstmvpex.view.fragment.UserFragment;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.fragment_container)
    LinearLayout fragmentContainer;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(new UserFragment(),"1");
        transaction.commit();
    }
}
