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
public class CajeroThread extends Thread {
    private String nombre;
    private Cliente cliente;
    private long initialtime;

    public CajeroThread(String nombre, Cliente cliente, long initialtime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialtime = initialtime;
    }
    
    
    @Override
    public void run(){
    
         System.out.println("La cajera "+this.nombre+
                " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + this.cliente.getNombre()+ 
                "EN EL TIEMPO: "+ (System.currentTimeMillis()-this.initialtime)/1000 + "seg");
        
        for (int i = 0; i < cliente.getCarrocompra().length; i++) {
           this.esperarXsegundos(cliente.getCarrocompra()[i]);
            System.out.println("Procesando el producto "+ (i+1)
                    +" del cliente "+ this.cliente.getNombre() + "->Tiempo: "
                    + (System.currentTimeMillis()-this.initialtime)/1000 + "seg");
        }
        
        System.out.println("La cajera "+ this.nombre +" HA TERMINADO DE PROCESAR" 
                +cliente.getNombre()+ " EN EL TIEMPO "+  (System.currentTimeMillis()-this.initialtime)/1000 + "seg");
    
    
    
    
    }
    
      private void esperarXsegundos(int segundos){
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    
    
    }
    
}
