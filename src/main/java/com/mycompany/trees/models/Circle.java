
package com.mycompany.trees.models;

public class Circle extends GraphicalObject{
    private int cx;
    private int cy;
    private int r;
    private String fill;
    
    public Circle(int cx, int cy, int r, String fill){
        this.type = "circle";
        this.cx = cx;
        this.cy = cy;
        this.r = r;
        this.fill = fill;
    }

    public int getCx() {
        return cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }

    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString(){
        return this.getCx()+" "+this.getCy()+" "+this.getR()+" "+this.getFill()+" "+this.getType();
    }
}
