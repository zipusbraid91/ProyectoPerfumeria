/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perfumefactory.StageOneProcess;

/**
 *
 * @author IVAN RIOS
 */
public class Fragance {
    private final String strName;
    private final Sex sexFragance;
    
    public Fragance(String strName, Sex sexFragance){
        this.strName = strName;
        this.sexFragance = sexFragance;
    }
    
    public String getName(){
        return strName;
    }
    
    public Sex getSexFragance(){
        return sexFragance;
    }
}
