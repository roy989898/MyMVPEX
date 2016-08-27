package poly.pom.myfirstmvpex.view.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import poly.pom.myfirstmvpex.MyApplication;
import poly.pom.myfirstmvpex.R;
import poly.pom.myfirstmvpex.presentation.UserPresenter;
import poly.pom.myfirstmvpex.view.Userview;


public class UserFragment extends Fragment implements Userview {
    @BindView(R.id.ed_userName)
    EditText edUserName;
    @BindView(R.id.bt_save)
    Button btSave;
    @Inject
    UserPresenter presenter;

    @Inject
    Context context;

    public UserFragment() {
        // Required empty public constructor
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.resume();
    }

    @Override
    public void onPause() {
        super.onPause();
        presenter.pause();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((MyApplication) (getActivity().getApplication())).getAppComponent().inject(this);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        ButterKnife.bind(this, view);

        presenter.setView(this);
        return view;
    }

    @OnClick(R.id.bt_save)
    public void onClick() {
        presenter.saveUser();

    }

    //Contract
    @Override
    public String getUserName() {
        return edUserName.getText().toString();
    }

    @Override
    public void displayUserName(String name) {
        edUserName.setText(name);
    }


    @Override
    public void showSuccessToast() {
        Toast.makeText(context, "Save Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFailToast() {
        Toast.makeText(context, "Save Fail", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showUserName(String name) {
        edUserName.setText(name);
    }
}
