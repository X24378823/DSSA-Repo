/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsasproject;

/**
 *
 * @author RichardBadea
 */
public class Package implements PackageInterface{

    private Node head;
    private Node currentNode;
    private Node previousNode;
    private int size;

    public Package() {
        head = null;
        currentNode = null;
        previousNode = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object theElement, int position) {
        if (position == 1) {
            Node newNode = new Node(theElement, head);
            head = newNode;
        } else {
            setCurrent(position);
            Node newNode = new Node(theElement, currentNode);
            previousNode.setNext(newNode);

        }
        size++;
    }

    @Override
    public void add(Object theElement) {
        Node newNode = new Node(theElement, null);
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(size);
            currentNode.setNext(newNode);
        }
    }

    /**
     *
     * @param position
     * @return
     */
    @Override
    public Object get(int position) {
        setCurrent(position);
        return currentNode.getElement();
    }

    @Override
    public Package remove(int position) {
        if (position == 1) {
            head = head.getNext();
        } else {
            setCurrent(position);
            currentNode.setNext(currentNode.getNext());
        }
        size--;
        return null;

    }
}
