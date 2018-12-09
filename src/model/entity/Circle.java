package model.entity;

import java.awt.*;

public class Circle extends Point {

    {
        System.out.println("radius = " + getRadius());
        int sum = 0;
        for(int i=0; i<Math.random()*10; i++){
            sum += Math.random()*10;
        }

        radius = sum;
        System.out.println("radius = " + getRadius());
    }

    private  int radius = 100500;
    public  Circle(int x, int y, int radius){
        super(0, 0);
        System.out.println("radius = " + this.radius);
        this.radius = radius;
        System.out.println("radius = " + this.radius);
    }

    public Circle(){
        super(0, 0);
        System.out.println("radius = " + this.radius);
        radius=0;

    }

    public Circle(int radius){
        this();
        System.out.println("radius = " + this.radius);
        this.radius = radius;
        System.out.println("radius = " + this.radius);
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

}
