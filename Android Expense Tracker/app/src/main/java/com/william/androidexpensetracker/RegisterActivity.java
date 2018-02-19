package com.william.androidexpensetracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by william on 2/19/2018.
 */

public class RegisterActivity extends AppCompatActivity{
    @BindView(R.id.txtFirstName) EditText txtFirstName;
    @BindView(R.id.txtLastName) EditText txtLastName;
    @BindView(R.id.txtUsernameRegis) EditText txtUsernameRegis;
    @BindView(R.id.txtPasswordRegis) EditText txtPasswordRegis;
    @BindView(R.id.txtExpenseMonthly) EditText txtExpenseMonthly;

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        // TODO Use fields...

    }

    @OnClick(R.id.btnRegister)
    public void register(){
        String firstName = txtFirstName.getText().toString();
        String lastName = txtLastName.getText().toString();
        String userName = txtUsernameRegis.getText().toString();
        String pswd =txtPasswordRegis.getText().toString();
        String expenseMonthly = txtExpenseMonthly.getText().toString();


    }
}
