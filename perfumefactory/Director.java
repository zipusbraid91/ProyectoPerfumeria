/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perfumefactory;
import com.mycompany.perfumefactory.StageOneProcess.GlassType;
import com.mycompany.perfumefactory.StageOneProcess.Fragance;
/**
 *
 * @author IVAN RIOS
 */

public class Director {
    
    public void constructStageOnePerfume(IStageOneBuilder builder, GlassType glassType, Fragance fragance){
        builder.setGlassType(glassType);
        builder.setFragance(fragance);
    }
    
}
