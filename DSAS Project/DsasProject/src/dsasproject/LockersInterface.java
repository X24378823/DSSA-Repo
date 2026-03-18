/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dsasproject;

/**
 *
 * @author RichardBadea
 */
public interface LockersInterface {
    
    public boolean isEmpty();
    
    public Object frontElement();
    
    public void enqueue(Object element);
    
    public Object dequeue();
    
}
