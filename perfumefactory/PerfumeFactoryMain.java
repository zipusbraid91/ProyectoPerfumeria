/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.perfumefactory;

import com.mycompany.perfumefactory.StageOneProcess.Fragance;
import com.mycompany.perfumefactory.StageOneProcess.GlassType;
import com.mycompany.perfumefactory.StageOneProcess.Sex;
import com.mycompany.perfumefactory.StageOneProcess.StageOneBuilder;
import com.mycompany.perfumefactory.StageOneProcess.StageOnePerfume;

/**
 *
 * @author IVAN RIOS
 */
public class PerfumeFactoryMain {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GlassType single60 = new GlassType("Single",60);
        Fragance isseyMiyakeMale = new Fragance("Issey Miyake",Sex.MASCULINO);
               
        Director directorStageOne = new Director();
        StageOneBuilder perfumeStageOneBuilder = new StageOneBuilder();
        
        directorStageOne.constructStageOnePerfume(perfumeStageOneBuilder, single60, isseyMiyakeMale);
        
        StageOnePerfume perfume1 = perfumeStageOneBuilder.getResult();
        System.out.println(perfume1.info());        
        
        
    }
    
}
