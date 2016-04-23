/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dj2.core;

import java.io.Serializable;

/**
 * this is the concert class, inherited from the album class. + has a location.
 * @author HP-Pavilion
 */
public class Concert extends Album implements Serializable{
    private String location;
	
    /**
     * constructor : initializes all the values of the superclass + the location.
     * @param title input
     * @param imgpath input
     * @param description input
     * @param releaseDate input
     * @param numTracks input
     * @param artist input
     * @param location input
     */
    public Concert(String title, String imgpath, String description, String releaseDate, int numTracks, Artist artist, String location){
		super(title, imgpath, description, releaseDate, numTracks, artist);
		this.location = location;
		}
	
    /**
     * returns the location of the concert.
     * @return this location
     */
    public String getLocation(){
          return this.location;
    }
    
    @Override
    public String toString(){
		
        return super.toString() + " | location: " + location ;
		}
    
    /**
     * Sets the location of the concerts.
     * @param location the location
     */
    public void setLocation(String location){
        this.location = location;
    }
    
}
