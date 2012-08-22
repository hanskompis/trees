
package com.mycompany.trees.models;

public class Text extends GraphicalObject{
   private int x;
   private int y;
   private String text;

    public Text() {
    }
   
    public Text(int x, int y, String text) {
        this.type = "text";
        this.x = x;
        this.y = y;
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
   
   
}
