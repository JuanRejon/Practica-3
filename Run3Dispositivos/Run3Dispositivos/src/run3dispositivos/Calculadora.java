/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run3dispositivos;

/**
 *
 * @author Dell
 */
public class Calculadora extends DispositivosElectronicos implements IOperacionesAritmericas{
    
    public Calculadora(){
        
    }
    
    private String modelo;
    
    @Override
    public void encender(){
        System.out.println("Calculadora encendida.\n");
    }
    
    
    public double Sen(double v3){
        return Math.sin(v3);
    }
    
    public double Cos(double v3){
        return Math.cos(v3);
    }
    
    public double Tan(double v3){
        return Math.tan(v3);
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
