/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perfumefactory.StageOneProcess;

import java.util.ArrayList;

/**
 *
 * @author IVAN RIOS
 */
public class GlassType {
    private final String strGlassName;
    private final int intGlassSize;
    
    public static ArrayList<GlassType> lstGlassType = new ArrayList<GlassType>();
    
    public GlassType(String strGlassName, int intGlassSize){
        this.strGlassName = strGlassName;
        this.intGlassSize = intGlassSize;
        lstGlassType.add(this);
    }
    
    public String getGlassType(){
        return strGlassName;
    }
    public int getGlassSize(){
        return intGlassSize;
    }
    
    
}
