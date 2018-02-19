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
    @BindView(R.id.txtEmail) EditText txtEmail;
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
        String email = txtEmail.getText().toString().trim();
        String userName = txtUsernameRegis.getText().toString().trim();
        String pswd =txtPasswordRegis.getText().toString().trim();
        String expenseMonthly = txtExpenseMonthly.getText().toString().trim();


    }
}
