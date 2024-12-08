/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad1;

/**
 *
 * @author fpatr
 */
public class Persona {
    
    private double estatura;
    private double peso;

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    public double obtenerIMC (){
        double imc = this.getPeso () / Math.pow(this.getEstatura(),2);
        return imc;
    }
    
}
