/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.time.LocalDate;

/**
 *
 * @author Sara
 */
public class Jugador {
    
    private String nombre;
    private LocalDate nacimiento;
    private int canastas;
    private Equipo equipo;

    public Jugador(String nombre, LocalDate nacimiento, int canastas, Equipo equipo) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.canastas = canastas;
        this.equipo = equipo;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getCanastas() {
        return canastas;
    }

    public void setCanastas(int canastas) {
        this.canastas = canastas;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + ", canastas=" + canastas + ", equipo=" + equipo + '}';
    }
    
    
    
    
    
}
