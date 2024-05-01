/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author Hatto
 */
abstract public class BaseModel implements MachineLearningModel {
    protected  String name ;
    private int version ;
    private String description;
    private String device ;
    public BaseModel ( String name, int version,String device, String description  ){
        this.name=name;
        this.version=version;
        this.description=description;
    }
   abstract public  String displayDetails();
}
