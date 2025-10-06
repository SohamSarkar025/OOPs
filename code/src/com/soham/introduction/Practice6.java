package com.soham.introduction;

//6.Constructor Calling Another Constructor
//Question:
//Design a class called Point that represents a point in 3D space with:
//
//x (int)
//
//y (int)
//
//z (int)
//
//Implement three constructors, using this(...) for constructor chaining:
//
//Point(int x, int y, int z): The main constructor that sets all three coordinates.
//
//Point(int x, int y): Assumes a 2D point and sets z to 0. Must call the 3-argument constructor using this.
//
//Point(): Assumes a point at the origin and sets all coordinates to 0. Must call the 2-argument constructor using this.
//
//Demonstrate creating an object using the no-argument constructor and printing its coordinates.
public class Practice6 {

    public static void main(String[] args) {
        Point A = new Point(1,2,3);
        Point B = new Point(5,6);
        Point C = new Point();
    }
}
class Point{
    int x;
    int y;
    int z;
    Point(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
        System.out.println(" X="+this.x+",Y="+this.y+",Z="+this.z);
    }
    Point(int x, int y){
        this(x,y,0);
    }
    Point(){
        this(0,0);
    }
}
