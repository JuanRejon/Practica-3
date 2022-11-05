/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package run3dispositivos;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Run3Dispositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Telefono samsung = new Telefono();
        Calculadora casio = new Calculadora();
        
        Scanner obj = new Scanner(System.in);
        
        String contTel = "";
        
        //parte del telefono
        samsung.encender();
        
        System.out.println("Ingresa dos numeros a usar:");
        double v1 = obj.nextDouble();
        double v2 = obj.nextDouble();
        
        System.out.println("Ingresa el contacto a llamar:");
        obj.nextLine();
        contTel = obj.nextLine();
        System.out.println("Ingresa el numero a llamar:");
        long numTel = obj.nextLong();
        
       
        double a = samsung.Suma(v1, v2);
        double b = samsung.Resta(v1, v2);
        double c = samsung.Multi(v1, v2);
        double d = samsung.Divis(v1, v2);
        
        samsung.setMarca("Samsung");
        samsung.setModelo("S8 Plus");
        samsung.setColor("Galaxia Purple");
        System.out.println("Marca, Modelo, Color: " + samsung.getMarca() + " " + samsung.getModelo()+ " " + samsung.getColor());
        
        samsung.contBuscar(contTel);
        samsung.hacerLlamada(numTel);
        samsung.endLlamada();
        
        
        System.out.println("La suma de " + v1 + " + " + v2 + " = " + a);
        System.out.println("La resta de " + v1 + " - " + v2 + " = " + b);
        System.out.println("La multiplicacion de " + v1 + " * " + v2 + " = " + c);
        System.out.println("La division de " + v1 + " / " + v2 + " = " + d);
        samsung.apagar();
        
        
        casio.encender();
        
        System.out.println("Ingresa un numero para operaciones especiales:");
        double v3 = obj.nextDouble();
        
        double a2 = casio.Suma(v1, v2);
        double b2 = casio.Resta(v1, v2);
        double c2 = casio.Multi(v1, v2);
        double d2 = casio.Divis(v1, v2);
        double e = casio.Sen(v3);
        double f = casio.Cos(v3);
        double g = casio.Tan(v3);
        
        
        casio.setMarca("CASIO");
        casio.setModelo("T-98E3");
        casio.setColor("Deep Blue");
        System.out.println("Marca, Modelo, Color: " + casio.getMarca() + " " + casio.getModelo() + " " + casio.getColor());
        
        System.out.println("La suma de " + v1 + " + " + v2 + " = " + a2);
        System.out.println("La resta de " + v1 + " - " + v2 + " = " + b2);
        System.out.println("La multiplicacion de " + v1 + " * " + v2 + " = " + c2);
        System.out.println("La division de " + v1 + " / " + v2 + " = " + d2);
        System.out.println("El seno de " + v3 + " = " + e);
        System.out.println("El coseno de " + v3 + " = " + f);
        System.out.println("La tangente de " + v3 + " = " + g);
    }
    
}
