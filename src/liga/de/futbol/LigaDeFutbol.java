/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liga.de.futbol;

import java.util.*;
public class LigaDeFutbol {

  
    public static void main(String[] args) {
       ArrayList<Jugador> jugadores_equipo1=new ArrayList<>();
       for(int i=2;i<7;i++){
           jugadores_equipo1.add(new Jugador(i,2));
           jugadores_equipo1.add(new Jugador(i+5,3));
       }
       jugadores_equipo1.add(new Jugador (1,1));
       ArrayList<Jugador> jugadores_equipo2=new ArrayList<>();
       for(int i=2;i<7;i++){
           jugadores_equipo2.add(new Jugador(i,2));
           jugadores_equipo2.add(new Jugador(i+5,3));
       }
       jugadores_equipo2.add(new Jugador (1,1));
        ArrayList<Equipo> equipos_liga_POO=new ArrayList<>();
    Gerente gerente_equipo1=new Gerente ("Florentino Perez",72,51964879);
    Gerente gerente_equipo2=new Gerente ("Oscár Grau",54,1000587478);
    Equipo equipo1=new Equipo("Real Madrid",gerente_equipo1,jugadores_equipo1);
    Equipo equipo2=new Equipo("Barcelona",gerente_equipo2,jugadores_equipo2);
    equipos_liga_POO.add(equipo2);
    equipos_liga_POO.add(equipo1);
    Liga liga_POO =new Liga("Liga POO",equipos_liga_POO,1000000);
    liga_POO.listarGerentes();
    }
   
    
}
