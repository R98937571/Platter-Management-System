
package com.mycompany.plattermanagementcomposition;

public class Rectangle {
    private double length;
    private double breadth;
    
    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    
    public double getRectangleArea(){
        return length*breadth;
    }
    public double getRectangleParameter(){
        return 2*(length+breadth);
    }
    
}
