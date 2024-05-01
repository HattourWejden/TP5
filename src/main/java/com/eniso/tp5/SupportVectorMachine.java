/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author Hatto
 */
public class SupportVectorMachine extends BaseModel {
    private int iterations ;
    private double learningRate ;

    public SupportVectorMachine(String name, int version, double learn, int iterations, String description , String device  ) {
        super(name, version, description, device );
        this.learningRate=learn;
        this.iterations= iterations;
    }



    @Override
    public String  displayDetails() {
        return " string" ; 
    }
   

    @Override
    public void train(Dataset dataset) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String  predict(Dataset dataset) {
        return "string";
    }
    
    
}
