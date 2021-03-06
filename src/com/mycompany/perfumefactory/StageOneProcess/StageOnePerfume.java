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
public class StageOnePerfume {

    private final GlassType glassType;
    private final Fragance fragance;
    
    public static ArrayList<StageOnePerfume> lstStageOnePerfume = new ArrayList<StageOnePerfume>();

    public StageOnePerfume(GlassType glassType, Fragance fragance) {
        this.glassType = glassType;
        this.fragance = fragance;
        lstStageOnePerfume.add(this);
    }

    public GlassType getGlassType() {
        return glassType;
    }

    public Fragance getFragance() {
        return fragance;
    }

    public String info() {
        String data = "";
        data += "Fragancia: " + fragance.getName() + "\n";
        data += "Género: "+fragance.getSexFragance()+"\n";
        data += "Envase: "+glassType.getGlassType()+"\n";
        data += "Tamaño: "+glassType.getGlassSize()+"\n";
        
        return data;
    }
}
