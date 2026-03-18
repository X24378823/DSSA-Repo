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
public class Lockers implements LockersInterface{

    private ArrayList<Node> lockers = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return lockers.isEmpty();
    }

    @Override
    public int size() {
        return lockers.size();
    }
    
    @Override
    public Object frontElement() {
        if (lockers.size() > 0) {
            return lockers.get(0);
        } else {
            return null;
        }
    }
    
    @Override
    public void enqueue(Object element) {
        lockers.add((Node) element);
    }
    
    @Override
    public Object dequeue() {
        if(lockers.size() > 0) {
            return lockers.remove(0);
        } else {
            return null;
        }
    }

}
