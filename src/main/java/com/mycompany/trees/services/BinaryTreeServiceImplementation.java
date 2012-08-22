//package com.mycompany.trees.services;
//
//import com.mycompany.trees.models.BinaryTree;
//import com.mycompany.trees.models.BinaryTreeNode;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class BinaryTreeServiceImplementation implements BinarytreeService {
//
//    @Autowired
//    private BinaryTree binarytree;
//
//    @Override
//    public List getBinaryTree() {
//        return binarytree.getNodes();
//    }
//
//    @Override
//    public void constructTestTree() {
//        BinaryTreeNode node1 = new BinaryTreeNode(1, null, null, null);
//        BinaryTreeNode node2 = new BinaryTreeNode(2, null, null, null);
//        BinaryTreeNode node3 = new BinaryTreeNode(3, null, null, null);
//        node1.setParent(node2);
//        node1.setLeftChild(null);
//        node1.setRightChild(null);
//        node3.setParent(node2);
//        node3.setLeftChild(null);
//        node3.setRightChild(null);
//        node2.setParent(null);
//        node2.setLeftChild(node1);
//        node2.setRightChild(node3);
//        binarytree.addNode(node1);
//        binarytree.addNode(node2);
//        binarytree.addNode(node3);
//
//    }
//}
