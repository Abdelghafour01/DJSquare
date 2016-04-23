/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dj2.core;

import java.io.*;

/**
 * list of generic nodes
 * @author Pavilion
 * @param <T> generic type
 */
public class GenericList<T extends Playable> implements Serializable{
    
    private GenericNode<T> head, last;

    private T t;
    /**
     * creates an Generic List
     */
    public GenericList(){
         head = last = null;
     }
    
    
    /**
     * adds an node to the list.
     * @param t
     */
    public void add(T t){
      
	GenericNode<T> toadd = new GenericNode(t);
        
        toadd.next = head;
        head = toadd;
			
	if(last == null)
            last = head;
     
        
    }
		
    /**
     * Deletes an node from the list (if its title corresponds to the entered node).
     * @param todelete to be deleted
     * @return boolean
     * @throws dj2.core.EmptyListException
     */
    public boolean remove(T todelete) throws EmptyListException{
        GenericNode<T> walker = head;
        
        if (head == null)
            throw new EmptyListException("trying to remove from an empty list");
        
        if(todelete.equals(head.t)){
            
            if(head == last){
                head = last = null;
                return true;
            }
            
            head = head.next;
            return true;
        }
        
        while(walker.next != null){
        
            if(todelete.equals(walker.next.t)){
                walker.deleteNext();
                return true;
            }
            
        }
            
            return false;	
    }

    /**
     *displays the list
     */
    public void display(){ 
        GenericNode<T> walker = head;
        
        if (walker == null)
                System.out.println("null");
            while (walker != null){
                System.out.println(walker);
                walker = walker.next;
            }
    }
 
    /**
     * displays n elements
     * @param n number of nodes to be displayed
     */
    public void display(int n){ 
        GenericNode<T> walker = head;
        
        if (walker == null)
                System.out.println("null");
        
            for(int i=0; i < n; i++){
                if (walker == null)
                        return;
                System.out.println(walker);
                walker = walker.next;
            }
    }

    /**
     * search and returns the content of node, else returns null
     * @param title to be looked for
     * @return l
     * @throws NullPointerException
     */
    public T search(String title) throws NullPointerException{
        GenericNode<T> iterator = head;
       
        while(!iterator.t.toString().equals(title)){
            iterator = iterator.next;
        }
        return iterator.t;
    }

    /**
     * gets the element number N
     * @param n element to be returned
     * @return T element
     */
    public T get(int n) {
       GenericNode<T> walker = head;
       for(int i=0;i<n && walker != null;i++)
           walker = walker.next;
           
        if(walker == null)
           return null;
           
        return walker.t;
    }

    /**
     * Returns true if found, false if not
     * @param t to be looked for
     * @return boolean
     */
    public boolean search(T t){
        GenericNode<T> walker = head;
        while(walker != null){
            if(walker.t.equals(t)) 
                return true;
            walker = walker.next;
        
        }
        return false;
        
    }

  }
