/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dj2.core;

import java.io.*;

/**
 * Nodes to be used in generic List
 * @author Pavilion
 * @param <T> Generic type
 */
public class GenericNode<T> implements Serializable{
      /**
     * reference of the next element in the linked list.
     */
    public GenericNode next;

    /**
     * containing the element in the node.
     */
    public T t;

    /**
     * Constructor (creates a node with the corresponding album).
     * @param t
     */
    public GenericNode(T t) {
        this.t = t;    
    }
	
    /**
     * adds a node to the head.
     * @param node
     */
    public void add(GenericNode<T> node){
		node.next = this;
		//this = node;
		}
			
    /**
     * deletes the next node in the list.
     */
    public void deleteNext(){
		this.next = this.next.next;
		}


    @Override
    public String toString() {
      return t.toString();
    }

}
