/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dsasproject;

/**
 *
 * @author RichardBadea
 */
public interface PackageInterface {
    
    public Object get(int position);
    
    public void add(Object theElement, int position);
    
    public void add(Object theElement);
    
    public Package remove(int position);
    
    public boolean isEmpty();
    
    public int size();
    
    public void printStream();
    
    
    
}
