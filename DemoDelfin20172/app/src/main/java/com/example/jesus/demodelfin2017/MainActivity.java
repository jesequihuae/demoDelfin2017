package com.example.jesus.demodelfin2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button registro_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registro_btn = (Button) findViewById(R.id.botonRegistro);

        registro_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarARegistro();
            }
        });
    }

    public void enviarARegistro(){
        Intent i = new Intent(this,RegistroUsuario.class);
        startActivity(i);
    }
}
