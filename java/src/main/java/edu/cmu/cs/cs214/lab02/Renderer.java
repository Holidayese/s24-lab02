package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    /**
     * Modify the Renderer class to accept a Shape interface type instead of a specific Rectangle.
     * This way, Renderer can work with any shape that implements Shape.
     */
    public Shape shape;
    
    Renderer(Shape shape) {
        this.shape = shape;
    }

    void draw() {
        double area = shape.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
