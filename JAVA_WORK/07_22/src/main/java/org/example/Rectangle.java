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
        return e;
    }
    public void show(){
        System.out.println("x : "+x+"\t"+"y : "+y+"\t"+"너비 : "+width*height);
    }

    public boolean contains(){
        if(x>1 && y>1){
            if(x+width<11 && y+height<11){

            }
        }
        else{

        }

        return result;
    }



}