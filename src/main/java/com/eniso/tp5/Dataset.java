/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author Hatto
 */
abstract public class Dataset {
    
    protected boolean isTrain ;
    protected String path ;
    
    public abstract void loadData();
    public abstract void processData();
}
