/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author Hatto
 */
public class NeuralNetwork extends BaseModel {
    private  int[] layers;
    private String activationFunction;

    public NeuralNetwork(String name,int version, String description, String device, int[] layers, String activationFunction ) {
        super(name, version, description, device);
        this.activationFunction = activationFunction;
        this.layers = layers;
    }

    @Override
    public String  displayDetails() {
        return "string";
    }

    @Override
    public void train(Dataset dataset) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String  predict(Dataset dataset) {
        return "string" ; 
    }  
}
