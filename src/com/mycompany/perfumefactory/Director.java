
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
