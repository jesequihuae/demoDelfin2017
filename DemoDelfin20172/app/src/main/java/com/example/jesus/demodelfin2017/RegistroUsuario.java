package com.example.jesus.demodelfin2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroUsuario extends AppCompatActivity {

    Button regresar_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        regresar_btn = (Button) findViewById(R.id.backMainFromRegister);

        regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarAPrincipal();
            }
        });
    }

    public void enviarAPrincipal(){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
