/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OperacionesMatematicas;

/**
 *
 * @author juand
 */
public class Operaciones {
    public static double resultado;
    public static double resultadoM;
    
    public static String calcularFuerza(double x, double y, double z){
        //x=c1 y=c2 z=dist
        resultado=(9e9*x*y)/(z*z);
        return (resultado+"");
    }
    
    public static String calcularDistancia(double x, double y, double z){
        //x=c1 y=c2 z=fuerza
        if(z<0){
            z=z*-1;
        }
        if(x<0){
            x=x*-1;
        }
        if(y<0){
            y=y*-1;
        }
        resultado=Math.sqrt((9e9*x*y)/(z));
        return (resultado+"");
    }
    
    public static String calcularCarga(double x, double y, double z){
        //x=c1 o c2 y=distancia z=fuerza
        resultado=((y*y)*z)/(9e9*x);
        return (resultado+"");
    }
    
    public static String conversionCM(double x){
        resultadoM=x/100;
        return (resultadoM+"");
    }
    
    public static String conversionmMM(double x){
        resultadoM=x/1000;
        return (resultadoM+"");
    }
    
    public static String conversionCarga(double x){
        resultadoM=x/1e+6;
        return (resultadoM+"");
    }
    
}
