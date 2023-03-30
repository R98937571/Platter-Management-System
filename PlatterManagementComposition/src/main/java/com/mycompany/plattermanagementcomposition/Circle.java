/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plattermanagementcomposition;

/**
 *
 * @author hp
 */
public class Circle 
{
    private double radius;
   
    public Circle(double radius)
    {
        this.radius=radius;
    }

    public double getCircleArea(){
        return 3.14*radius*radius;
    }
    public double getCircleCumfrance(){
        return 2*3.14*radius;         
    }
    
}
