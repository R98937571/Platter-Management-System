/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plattermanagementcomposition;

/**
 *
 * @author hp
 */
public class Platter1 {
    
    private Rectangle rectangle;
    private Circle circle1;
    private Circle circle2;
    private Circle circle3;
    private Square square;
  

    public Platter1(double length, double breadth, double radius1, double radius2, double radius3,double side )
    {
        
    rectangle=new Rectangle(length,breadth);
    circle1=new Circle(radius1);
    circle2=new Circle(radius2);
    circle3=new Circle(radius3);
    square=new Square(side);
    }
    
    public double getOuterBoundry()
    {
        return rectangle.getRectangleParameter();
        
        }
    
    public  double getVacantArea()
    {
        return rectangle.getRectangleArea()-circle1.getCircleArea()-circle2.getCircleArea()-circle3.getCircleArea()-(square.getArea()*4);
    }
    

}
        
