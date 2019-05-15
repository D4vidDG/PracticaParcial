/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liga.de.futbol;

import java.util.*;
public class Equipo {
    private String nombre;
    private Gerente gerente;
    private ArrayList<Jugador> jugadores;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Equipo(String nombre, Gerente gerente, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.gerente = gerente;
        this.jugadores = jugadores;
    }
    
    
}


