/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perfumefactory.StageOneProcess;

import com.mycompany.perfumefactory.IStageOneBuilder;

/**
 *
 * @author IVAN RIOS
 */
public class StageOneBuilder implements IStageOneBuilder{
    
    private GlassType glassType;
    private Fragance fragance;
    
    @Override
    public void setGlassType(GlassType glassType){
         this.glassType = glassType;
    }

    @Override
    public void setFragance(Fragance fragance) {
        this.fragance = fragance;
    }
    
    public StageOnePerfume getResult(){
        return new StageOnePerfume(glassType,fragance);
    }
    
}
