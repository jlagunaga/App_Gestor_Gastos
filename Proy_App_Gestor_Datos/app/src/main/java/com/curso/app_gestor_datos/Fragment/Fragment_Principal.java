package com.curso.app_gestor_datos.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

import com.curso.app_gestor_datos.R;
import com.curso.app_gestor_datos.Utils.Utils;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Principal extends Fragment {

    @BindView(R.id.spinMeses)
    Spinner spinMeses;
    @BindView(R.id.img_prueba)
    ImageView imgPrueba;
    @BindView(R.id.lstDocVencer)
    ListView lstDoc_Vencer;

    public Fragment_Principal() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista=inflater.inflate(R.layout.fragment__principal, container, false);
        ButterKnife.bind(this,vista); // inicicion de anotacines Butter

       String urlImg="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQKyGNvl0zpPlYFlGFsQZoo5ieeeFkKdFaCnHCDLCkCz__D41i_&usqp=CAU";
       Picasso.with(vista.getContext()).load(urlImg).fit().error(R.drawable.error_default).into(imgPrueba);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(vista.getContext(),android.R.layout.simple_spinner_dropdown_item,Utils.filtroPeriodo());
        spinMeses.setAdapter(adapter);
        return vista;
    }// fin de on create

}// fin de clase
