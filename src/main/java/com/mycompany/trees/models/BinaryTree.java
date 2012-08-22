
package com.mycompany.trees.models;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class BinaryTree {

    private BinaryTreeNode root;
    private List graphicalObjects;
    private int height;

    public BinaryTree() {
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public List getGraphicalObjects() {
        return graphicalObjects;
    }

    public void setGraphicalObjects(List graphicalObjects) {
        this.graphicalObjects = graphicalObjects;
    }
    
    public List addNode(BinaryTreeNode newNode){
        this.graphicalObjects = new ArrayList<GraphicalObject>();        
        if(root == null){
            root = newNode;
            newNode.setCx(230);
            newNode.setCy(50);
            this.updateXInsertIntoList(newNode);
            return this.graphicalObjects;
        }
        BinaryTreeNode current = this.root;
        BinaryTreeNode parent = null;
        while(current != null){
            parent = current;
            if(newNode.getValue() < current.getValue()){
                current = current.getLeftChild();
            }
            else{
                current = current.getRightChild();
            }            
        }
        newNode.setParent(parent);
        if(newNode.getValue() < parent.getValue()){
            parent.setLeftChild(newNode);
            newNode.setCy(parent.getCy()+50);
            this.updateXInsertIntoList(this.getRoot());
            return this.graphicalObjects;
        }
        else {
            parent.setRightChild(newNode);
            newNode.setCy(parent.getCy()+50);
            this.updateXInsertIntoList(this.getRoot());
            return this.graphicalObjects;
        }        
   }
    
    private void makeDrawableNode(int x, int y, int value){
        GraphicalObject circle = new Circle(x, y, 20, "red");
        this.graphicalObjects.add(circle);
        GraphicalObject text = new Text(x, y, Integer.toString(value));
        this.graphicalObjects.add(text);
    }
    
    private int nodeHeight(BinaryTreeNode node){
        if(node == null){
            return -1;
        }
        int leftHeight = this.nodeHeight(node.getLeftChild());
        int rightHeight = this.nodeHeight(node.getRightChild());
        return Math.max(leftHeight, rightHeight)+1;            
    }
    
    private int getXCoordinateOffset(BinaryTreeNode node){
        int level = this.nodeHeight(node);
        return ((int)(Math.pow(2, level)))*25;
    }
    
    private void updateXInsertIntoList(BinaryTreeNode node){
        if(node == this.root){
            this.makeDrawableNode(node.getCx(), node.getCy(), node.getValue());
            this.updateXInsertIntoList(node.getLeftChild());
            this.updateXInsertIntoList(node.getRightChild());
        }
        else if(node == null){
            return;
        }
        else {
            if(node.getParent().getLeftChild() == node){
                node.setCx(node.getParent().getCx() - this.getXCoordinateOffset(node));
                this.makeDrawableNode(node.getCx(), node.getCy(), node.getValue());
                this.updateXInsertIntoList(node.getLeftChild());
                this.updateXInsertIntoList(node.getRightChild());
            }
            else {
                node.setCx(node.getParent().getCx() + this.getXCoordinateOffset(node));
                this.makeDrawableNode(node.getCx(), node.getCy(), node.getValue());
                this.updateXInsertIntoList(node.getLeftChild());
                this.updateXInsertIntoList(node.getRightChild());
            }            
        }
    }
}
