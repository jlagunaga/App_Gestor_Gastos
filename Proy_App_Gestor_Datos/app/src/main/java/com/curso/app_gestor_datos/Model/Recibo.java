package com.curso.app_gestor_datos.Model;

public class Recibo {

    private int id;
    private String icon;
    private String servicio;
    private String fecha_Venc;
    private String estadoRecibo;
    private double valor_recibo;

    public Recibo(int id, String icon, String servicio, String fecha_Venc, String estadoRecibo, double valor_recibo) {
        this.id = id;
        this.icon = icon;
        this.servicio = servicio;
        this.fecha_Venc = fecha_Venc;
        this.estadoRecibo = estadoRecibo;
        this.valor_recibo = valor_recibo;
    }

    public int getId() {
        return id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getFecha_Venc() {
        return fecha_Venc;
    }

    public void setFecha_Venc(String fecha_Venc) {
        this.fecha_Venc = fecha_Venc;
    }

    public String getEstadoRecibo() {
        return estadoRecibo;
    }

    public void setEstadoRecibo(String estadoRecibo) {
        this.estadoRecibo = estadoRecibo;
    }

    public double getValor_recibo() {
        return valor_recibo;
    }

    public void setValor_recibo(double valor_recibo) {
        this.valor_recibo = valor_recibo;
    }
}// fin de clase
