package com.example.usuario.inventorymaterial.ui.login;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.usuario.inventorymaterial.ui.dashboard.DashboardActivity;
import com.example.usuario.inventorymaterial.R;

/**
 * Actividad que maneja el alta de usuarios y
 * el ingreso a la aplicación.
 *
 * Cuando ingresa un usuario se lanza la actividad Dashboard.
 *
 * Implementa las reglas de LoginView
 *
 * @author Enrique Casielles Lapeira
 * @version 3.0
 * @see AppCompatActivity
 * @see LoginView
 */
public class LoginViewImpl extends AppCompatActivity implements LoginView {
    private TextView txvSignUp;
    private Button btnSignIn;
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txvSignUp = (TextView) findViewById(R.id.txvSignUp);
        txvSignUp.setPaintFlags(txvSignUp.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.validateCredentials(user, password);
                /*
                Intent intent = new Intent(LoginViewImpl.this, DashboardActivity.class);
                startActivity(intent);
                */
            }
        });
    }

    @Override
    public void navigateToHome() {

    }
}
