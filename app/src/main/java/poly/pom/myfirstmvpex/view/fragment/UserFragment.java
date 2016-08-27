package poly.pom.myfirstmvpex.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import poly.pom.myfirstmvpex.R;
import poly.pom.myfirstmvpex.view.userview;


public class UserFragment extends Fragment implements userview {


    @BindView(R.id.ed_userName)
    EditText edUserName;
    @BindView(R.id.bt_save)
    Button btSave;

    public UserFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.bt_save)
    public void onClick() {
    }
//Contract
    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public void showSuccessToast() {

    }

    @Override
    public void showFailToast() {

    }

    @Override
    public void showUserName(String name) {

    }
}
