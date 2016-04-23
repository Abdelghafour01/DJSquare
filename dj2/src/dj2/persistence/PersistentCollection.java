/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dj2.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import dj2.core.*;
import static dj2.core.Collection.allArtists;
import static dj2.core.Collection.recentlyPlayed;
import java.io.Serializable;

/**
 *
 * @author Pavilion
 */
public class PersistentCollection implements Serializable{
            private static final String collectionStore = "collection.ser";

    /**
     *
     */
	    private static ObjectInputStream collectionIn;
	    private static ObjectOutputStream collectionOut;

    /**
     *
     */
    public static Collection collection;
            
	    private PersistentCollection(){
                   
	    }
	    
    /**
     *
     * @return
     */
    public static Collection getInstance(){
	        if(collection == null){
	           
	        	try{
	            
                        System.out.print("1");
                        
	                collectionIn = new ObjectInputStream(new FileInputStream("tracks.ser"));
	                collection = (Collection)collectionIn.readObject();
	                collectionIn.close();
                        
                       /* collectionIn = new ObjectInputStream(new FileInputStream("artists.ser"));
	                allArtists = (GenericList<Artist>)collectionIn.readObject();
	                collectionIn.close();
                        
                        collectionIn = new ObjectInputStream(new FileInputStream("recent.ser"));
	                recentlyPlayed = (GenericList<Track>)collectionIn.readObject();
	                collectionIn.close();*/
	            
	        	}catch(IOException | ClassNotFoundException ex){
	            
	        		return new Collection();
	            
	        	}
	        }
	        return collection;
	    }
	    
    /**
     *
     * @throws IOException
     */
           
    public static void save()throws IOException {
	       
	    	if(collection == null)
	            return;
	    
          
            
	    collectionOut = new ObjectOutputStream(new FileOutputStream("tracks.ser"));
	    collectionOut.writeObject(collection);
	    collectionOut.close();
	    
            collectionOut = new ObjectOutputStream(new FileOutputStream("artists.ser"));
	    collectionOut.writeObject(allArtists);
	    collectionOut.close();
            
            collectionOut = new ObjectOutputStream(new FileOutputStream("recent.ser"));
	    collectionOut.writeObject(recentlyPlayed);
	    collectionOut.close();
            }
	}
