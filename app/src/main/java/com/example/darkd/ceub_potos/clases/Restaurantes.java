package com.example.darkd.ceub_potos.clases;

import com.google.android.gms.maps.model.LatLng;

import java.net.URL;

public class Restaurantes {
    private String nombre;
    private String direccion;
    private String servicios;
    private int telefono;
    private URL facebook;
    private LatLng ubicaion;

    public Restaurantes(String nombre, String direccion, String servicios, int telefono, URL facebook, float lat, float lng) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.servicios = servicios;
        this.telefono = telefono;
        this.facebook = facebook;
        this.ubicaion = new LatLng(lat,lng);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public URL getFacebook() {
        return facebook;
    }

    public void setFacebook(URL facebook) {
        this.facebook = facebook;
    }

    public LatLng getUbicaion() {
        return ubicaion;
    }

    public void setUbicaion(LatLng ubicaion) {
        this.ubicaion = ubicaion;
    }
}
