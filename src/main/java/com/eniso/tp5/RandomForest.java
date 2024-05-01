/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author Hatto
 */
public class RandomForest extends BaseModel {
    private int numTrees ;
 private int maxDepth ;

    public RandomForest(String name,int numTrees, int version, String description , int maxDepth , String  device ) {
        super(name,version,device , description);
        this.numTrees=numTrees;
        this.maxDepth  = maxDepth ;
        
        
    }

    @Override
    public String displayDetails() {
    return "string";}

    @Override
    public void train(Dataset dataset) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String  predict(Dataset dataset) {
       return " String"; 
    }
    
}
