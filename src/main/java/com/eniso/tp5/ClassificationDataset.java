/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author Hatto
 */
public class ClassificationDataset extends Dataset {
   
   private String[] labels ;
   private int numClasses;
   public  ClassificationDataset ( String path,boolean isTrain){
       this.path=path;
       this.isTrain=isTrain ;
     
     
   }
     @Override
     public void processData (){}

    public void loadData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
