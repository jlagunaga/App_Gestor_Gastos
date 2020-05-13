package com.curso.app_gestor_datos.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.curso.app_gestor_datos.Model.Recibo;

import java.util.List;

public class Adapter_Recibo extends BaseAdapter {
    private Context conexto;
    private List<Recibo>  lstRecibos;
    private int layut;

    public Adapter_Recibo(Context conexto, List<Recibo> lstRecibos, int layut) {
        this.conexto = conexto;
        this.lstRecibos = lstRecibos;
        this.layut = layut;
    } // fin de contructor

    @Override
    public int getCount() { return lstRecibos.size(); }

    @Override
    public Object getItem(int id) { return lstRecibos.get(id);}

    @Override
    public long getItemId(int id) { return id;}

    @Override
    public View getView(int i, View vista, ViewGroup viewGroup) {


        return vista;
    }
    public class PlaceHolder{
        private ImageView imgIconEntidad;
        private TextView txtTituloRecibo;
        private TextView txtFechaVenc;
        private TextView txtEstadoRec;
        private TextView txtMontoRec;
    }


}// fin de clase
