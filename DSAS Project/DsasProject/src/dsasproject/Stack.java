/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsasproject;

import java.util.*;

/**
 *
 * @author RichardBadea
 */
public class Stack implements StackInterface{
    private ArrayList<Node> stack = new ArrayList<>();
    
    @Override
    public Object pop() {
        if (!(stack.isEmpty())) {
            return stack.remove(stack.size() - 1);
        } else {
            return null;
        }
    }
    
    public void push(Object newPackage) {
        stack.add(0,  (Node) newPackage);
    }   
}
