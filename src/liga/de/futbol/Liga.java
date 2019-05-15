/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liga.de.futbol;

import java.util.*;
public class Liga {
    private String nombre;
    private ArrayList <Equipo> equipos ;
    private double premio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public Liga(String nombre, ArrayList<Equipo> equipos, double premio) {
        this.nombre = nombre;
        this.equipos = equipos;
        this.premio = premio;
    }
    
    public void listarGerentes(){
        int i=1;
        for(Equipo equipo:this.equipos){
            System.out.println("Equipo"+" "+i+"-------------");
            System.out.println("Nombre:"+equipo.getNombre());
            System.out.println("Gerente:"+equipo.getGerente().getNombre());
            System.out.println("Identificacion:"+equipo.getGerente().getCedula());
            i++;
        }
    }
}

