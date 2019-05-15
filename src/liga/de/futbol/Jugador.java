/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liga.de.futbol;

/**
 *
 * @author Estudiante
 */
public class Jugador {
    private int numero;
    private String rol;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

 
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Jugador(int numero, int rol) {
        this.numero = numero;
        switch(rol){
            case 1:
                this.rol="Portero";
                break;
                case 2:
                    this.rol="Alero";
                break;
                case 3:
                    this.rol="Defensor";
                break;
        }
    }
    
    
}
