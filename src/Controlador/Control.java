/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import Vista.Formulariohilo;    
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Control implements ActionListener{
    Cliente cliente1;
    CajeroThread cajera1;
    Cliente cliente2;
    CajeroThread cajera2;
    Formulariohilo form= new Formulariohilo();

    public Control() {
        this.form.getCajero1().addActionListener(this);
        this.form.getCajero2().addActionListener(this);
    }
    
    public void iniciar(){
    this.form.setLocationRelativeTo(null);
    this.form.setVisible(true);
    
    }
    
    
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource()==this.form.getCajero1()){
        long initialTime= System.currentTimeMillis();
        cliente1= new Cliente(this.form.getNomcajero1().getText(), new int[]{2, 2, 1, 5, 2, 3});
        cajera1= new CajeroThread(this.form.getNomcliente1().getText(),  cliente1, initialTime);
        cajera1.start();
        
        
        }
    
    if(e.getSource()==this.form.getCajero2()){
        long initialTime= System.currentTimeMillis();
        cliente2= new Cliente(this.form.getNomcajero2().getText(),  new int[]{1, 3, 5, 1, 1});
        cajera2= new CajeroThread(this.form.getNomcliente2().getText(),  cliente2, initialTime);
        cajera2.start();
        
        
        }
    
    }
    
    
}
