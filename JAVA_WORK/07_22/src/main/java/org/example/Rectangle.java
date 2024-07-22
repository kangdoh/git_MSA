package org.example;

public class Rectangle {
    int x;
    int y;
    int width;
    int height;

    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square(){
        int e = this.width * this.height;
        System.out.println(e);
        return e;
    }

    public void show(){

    }


}
