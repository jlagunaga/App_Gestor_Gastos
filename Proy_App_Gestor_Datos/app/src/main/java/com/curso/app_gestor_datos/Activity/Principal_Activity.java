package com.curso.app_gestor_datos.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.curso.app_gestor_datos.Fragment.Fragment_Principal;
import com.curso.app_gestor_datos.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Principal_Activity extends AppCompatActivity {
    @BindView(R.id.tolbar)
    Toolbar tolbarObj;
    Fragment_Principal objFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_);
        ButterKnife.bind(this); // inicicion de anotacines Butter

        //tolbarObj = (Toolbar)findViewById(R.id.tolbar);

        cargarToolbar(); // cargamos el tolbar
        objFragment= new Fragment_Principal(); // Cargar framgment inicial
        cargarFragment(objFragment);// se carga el fragment

    }// fin de oncreate

// generar metods

private void cargarFragment(Fragment objFragment){
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.framePrincipal,objFragment).commit();

}
private void cargarToolbar(){
    tolbarObj.setTitle("Resumen");
    setSupportActionBar(tolbarObj);
}



}// fin de clase
