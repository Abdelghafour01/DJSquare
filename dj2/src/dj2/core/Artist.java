/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dj2.core;

import java.io.Serializable;

/**
 * Artist
 * @author HP-Pavilion
 */
public class Artist implements Playable, Serializable{
    
    /**
     * Name of the Artist.
     */
    protected String name;   
  
    /**
     * Path of the artist's picture.
     */
    protected String imgpath;
    
    /**
     * Bio/description of the artist. 
     */
    protected String bio;
  
    /**
     * the number of Albums this artist/group has.
     */
    protected int numAlbums;

    /**
     * the number of Singles this artist/group has.
     */
    protected int numSingles;

    /**
     * the number of concerts this artist/group has.
     */
    protected int numConcerts;

    /**
     * the list of singles of this artist.
     */
    protected GenericList<Track> singles;

    /**
     * the list of albums of this artist.
     */
    protected GenericList<Album> albums;

    /**
     * the list of concerts.
     */
    protected GenericList<Concert> concerts;
	
    /**
     * the constructor initializes all the attributes.
     * @param name
     */
    public Artist(String name){
    this.name = name;
    }

    /**
     * Long Constructor of Artist
     * @param name input
     * @param imgpath input
     * @param bio input
     * @param singles input
     * @param albums input
     * @param concerts input
     * @param numAlbums input
     * @param numSingles input
     * @param numConcerts input
     */
    public Artist(String name, String imgpath, String bio, GenericList<Track> singles, GenericList<Album> albums, GenericList<Concert> concerts, int numAlbums, int numSingles, int numConcerts){
		this.name = name;
		this.imgpath = imgpath;
		this.bio = bio;
		this.singles = singles;
		this.albums = albums;
		this.concerts = concerts;
		this.numAlbums = numAlbums;
		this.numSingles = numSingles;
		this.numConcerts = numConcerts;
		}
	
    /**
     * returns the Name of the artist.
     * @return
     */
    public String getName(){
            return this.name;
        }
   
    /**
     * returns the description/bio of the artist.
     * @return
     */
    public String getBio(){
            return this.bio;
        }
        
    /**
     * returns the number of albums of the artist.
     * @return
     */
    public int getNumAlbums(){
            return this.numAlbums;
        }
        
    /**
     * returns the number of singles of the artist.
     * @return
     */
    public int getNumSingles(){
            return this.numSingles;
        }
        
    /**
     * returns the number of concerts of the artist.
     * @return
     */
    public int getNumConcerts(){
            return this.numConcerts;
        }
    
    /**
     * modify the name of the artist.
     * @param name
     */
    public void setName(String name){
            this.name = name;
        }
   
    /**
     * modify the bio of the artist.
     * @param bio
     */
    public void setBio(String bio){
            this.bio = bio;
        }
        
    /**
     * modify the number of albums of the artist.
     * @param numAlbums
     */
    public void setNumAlbums(int numAlbums){
            this.numAlbums = numAlbums;
        }
        
    /**
     * modify the number of singles of the artist?
     * @param numSingles
     */
    public void setNumSingles(int numSingles){
            this.numSingles = numSingles;
        }
        
    /**
     * modify the number of concerts of the artist.
     * @param numConcerts
     */
    public void setNumConcerts(int numConcerts){
            this.numConcerts = numConcerts;
        }
    /**
     * Returns a string containing the information about the Artist.
     * @return
     */
    @Override
    public String toString(){
			return name + " | " + bio + " | " + numSingles + " | " + numAlbums + " | " + numConcerts;
		}

    /**
     * plays the tracks of the artist
     */
    @Override
    public void play(){
    }
   
    /**
     *displays the tracks of the artist
     */
    public void display(){
       System.out.println("Singles:");
       singles.display(numSingles);
       
       System.out.println("Albums:");
      
       albums.display(numAlbums);
       System.out.println("Concerts:");
       concerts.display(numConcerts);
      
    }

    /**
     * equals method that compares the input and this
     * @param a input
     * @return
     */
    public boolean equals(Artist a){
        return this.getName().equals(a.getName());
    }
}
