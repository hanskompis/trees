
package com.mycompany.trees.controllers;

import com.mycompany.trees.models.BinaryTree;
import com.mycompany.trees.models.BinaryTreeNode;
import com.mycompany.trees.services.BinarytreeService;
import java.util.List;
import java.util.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TreeController {
//    private static final Logger LOG = (Logger) LoggerFactory.getLogger(
//            TreeController.class);
//    
@Autowired
private BinaryTree binarytree;
    
//@RequestMapping(method = RequestMethod.GET, value = "binarytree", produces = "application/json")
//    @ResponseBody
//    public List getBinaryTree(){
//        binarytreeService.constructTestTree();
//        return binarytreeService.getBinaryTree();
//    }

@RequestMapping(method = RequestMethod.POST, value = "binarytree", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public List addNode(@RequestBody BinaryTreeNode node){        
        return binarytree.addNode(node);
        //System.out.println(list.get(0));
    }
    
    
}
