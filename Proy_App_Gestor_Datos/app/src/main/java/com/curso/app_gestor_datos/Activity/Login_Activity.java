package com.curso.app_gestor_datos.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.curso.app_gestor_datos.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Login_Activity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btnLogin)Button btnIngresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this); // inicicion de anotacines Butter

        //btnIngresar=(Button)findViewById(R.id.btnLogin);


        btnIngresar.setOnClickListener(this);

    }// fin de onCreate

    @Override
    public void onClick(View view) {
        Intent intento=new Intent(this,Principal_Activity.class);
        startActivity(intento);
    }
}// fin de clase
