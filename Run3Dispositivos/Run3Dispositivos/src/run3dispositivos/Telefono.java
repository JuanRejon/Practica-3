/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run3dispositivos;

/**
 *
 * @author Dell
 */
public class Telefono extends DispositivosElectronicos implements IOperacionesAritmericas{

    public String modelo;
    
    @Override
    public void encender() {
        System.out.println("Telefono encendido.");
    }
    
    public void contBuscar(String a){
        System.out.println("Llamando a..." + a);
    }
    
    public void hacerLlamada(long num){
        System.out.println("Llamando a... " + num);
    }
    
    public void endLlamada(){
        System.out.println("Terminando llamada...");
    }
    
    @Override 
    public double Suma(double v1, double v2){
        return v1 + v2;
    }
    
    @Override
    public double Resta(double v1, double v2){
        return v1 - v2;
    }
    
    @Override
    public double Multi(double v1, double v2){
        return v1 * v2;
    }
    
    @Override
    public double Divis(double v1, double v2){
        return v1 / v2;
    }
    
    
}
