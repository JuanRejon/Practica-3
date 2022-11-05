/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run3dispositivos;

/**
 *
 * @author Dell
 */
public abstract class DispositivosElectronicos {
    
    //esta es la clase en la que se pondra todo, la clase padre
    
    private String marca;
    private String modelo;
    private String color;

    public String getMarca(){
        return marca;
    }
    
    public String setMarca(String marca){
        return this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String setModelo(String modelo){
        return this.modelo = modelo;
    }
    
    public String getColor(){
        return color;
    }
    
    public String setColor(String color){
        return this.color = color;
    }
    
    public abstract void encender(); //metodo abstracto
    
    public void apagar(){ //metodo implementado
        System.out.println("El telefono ha sido apagado.\n");
    }
    
    
}
