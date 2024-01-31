package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
//    public double height;
//    public double width;
    /**
     * Make the fields in Circle, Square, and Rectangle private and provide public getters.
     */
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
