/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Pc Smart
 */
public class Cliente {
     private String nombre;
    private int [] carrocompra;

    public Cliente(String nombre, int[] carrocompra) {
        this.nombre = nombre;
        this.carrocompra = carrocompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCarrocompra() {
        return carrocompra;
    }

    public void setCarrocompra(int[] carrocompra) {
        this.carrocompra = carrocompra;
    }
}
