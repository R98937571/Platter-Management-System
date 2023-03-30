/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plattermanagementcomposition;

/**
 *
 * @author hp
 */
public class Square 
{
    private double side;
    
    public Square(double side)
    {
        this.side=side;
    }
    
    public double getArea()
    {
        return side*side;
    }
    public double getParameters()
    {
        return 4*side;
    }
}
