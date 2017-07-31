package com.example.jesus.demodelfin2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button go_registro_btn;
    Button go_main_btn;
    Button login_btn;
    Button btn_login;
    Button continuar_btn;

    EditText nombreUsuario_login, contrasena_login;
    EditText nombreUsuario_registro, email_registro, contrasena_registro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        go_registro_btn = (Button) findViewById(R.id.loginParte).findViewById(R.id.goToRegister);
        go_main_btn     = (Button) findViewById(R.id.registroParte).findViewById(R.id.backMainFromRegister);
        continuar_btn   = (Button) findViewById(R.id.continuarButton);
        login_btn       = (Button) findViewById(R.id.botonLogin);
        btn_login       = (Button) findViewById(R.id.buttonLogin);

        nombreUsuario_login = (EditText) findViewById(R.id.loginParte).findViewById(R.id.input_nombreUsuarioLogin);
        contrasena_login    = (EditText) findViewById(R.id.loginParte).findViewById(R.id.input_passwordLogin);

        nombreUsuario_registro = (EditText) findViewById(R.id.registroParte).findViewById(R.id.input_nombreUsuario);
        email_registro         = (EditText) findViewById(R.id.registroParte).findViewById(R.id.input_email);
        contrasena_registro    = (EditText) findViewById(R.id.registroParte).findViewById(R.id.input_contrasena);

        agregarClickeableBotones();
    }

    public void agregarClickeableBotones()
    {
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.loginParte)
                        .setVisibility(View.VISIBLE);
                findViewById(R.id.loginParte)
                        .findViewById(R.id.goToRegister)
                        .setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                findViewById(R.id.loginParte).setVisibility(View.GONE);
                                findViewById(R.id.registroParte).setVisibility(View.VISIBLE);
                            }
                        }
                );
            }
        });

        go_registro_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.registroParte)
                        .setVisibility(View.VISIBLE);
                findViewById(R.id.registroParte)
                        .findViewById(R.id.backMainFromRegister)
                        .setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                findViewById(R.id.registroParte).setVisibility(View.GONE);
                            }
                        }
                );
            }
        });

        go_main_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.registroParte).setVisibility(View.GONE);
                findViewById(R.id.loginParte).setVisibility(View.GONE);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ContP.class);
                startActivity(intent);
            }
        });

        continuar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, google_test.class);
                startActivity(i);
            }
        });
    }

}
