/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dj2.core;

import java.io.Serializable;
import java.util.Objects;

/**
 * Album
 * @author Abdelghafour Mourchid 64066
 */
public class Album implements Playable, Serializable{
   
    /**
     * Title of the album.
     */
    protected String title;

    /**
     * path of the image.
     */
    protected String imgpath;

    /**
     * the release date.
     */
    protected String releaseDate;

    /**
     * Album description.
     */
    protected String description;

    /**
     * The number of tracks in the album.
     */
    protected int numTracks;

    /**
     * The list of tracks.
     */
    protected GenericList<AlbumTrack> tracks;

    /**
     * The album artist.
     */
    protected Artist artist;
	
    /**
     * the constructor (initializes all the attributes of the object).
     * @param title title input
     * @param imgpath path input
     * @param description input
     * @param releaseDate input
     * @param numTracks input
     * @param artist input
     */
    public Album(String title, String imgpath, String description, String releaseDate, int numTracks, Artist artist){
		this.title = title;
		this.imgpath = imgpath;
		this.description = description;
		this.releaseDate = releaseDate;
		this.numTracks = numTracks;
		this.tracks = new GenericList<>();
		this.artist = artist;
		} 

    /**
     * short Constructor of Album
     * @param title
     */
    public Album(String title) {
        this.title = title;
    }

    /**
     * returns the title
     * @return
     */
    public String getTitle(){
          return this.title;
    }
    
    /**
     * returns the description.
     * @return
     */
    public String getDesc(){
        return this.description;
    }
    
    /**
     * returns the release date.
     * @return
     */
    public String getReleaseDate(){
        return this.releaseDate;
    }
    
    /**
     * returns numTracks.
     * @return
     */
    public int getNumTracks(){
        return this.numTracks;
    }
    
    /**
     * returns the name of the artist.
     * @return
     */
    public String getArtistName(){
        return this.artist.getName();
    }
    
    /**
     * returns a string containing the information about the album.
     * @return 
     */
    @Override
    public String toString(){
	return "Title: " + title + " | description: "  + description + " | Number of tracks: " + numTracks + " | Artist/group: " + artist.name;
	}
	
    /**
     * plays all the tracks of the album.
     */
    @Override
    public void play(){
	
    }	
		
    /**
     * modify the title.
     * @param title
     */
    public void setTitle(String title){
        this.title = title;
    }
    
    /**
     * modify the path of the image.
     * @param imgpath
     */
    public void setImgPath(String imgpath){
        this.imgpath = imgpath;
    }
    
    /**
     * modify the description.
     * @param description
     */
    public void setDesc(String description){
        this.description = description;
    }
    
    /**
     * modify the releaseDate.
     * @param releaseDate
     */
    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }
    
    /**
     * modify the number of tracks.
     * @param numTracks
     */
    public void setNumTracks(int numTracks){
        this.numTracks = numTracks;
    }
    
    /**
     * modify the artist.
     * @param artist
     */
    public void setArtist(Artist artist){
        this.artist = artist;
    }
    
    /**
     * modify the list of tracks.
     * @param tracks
     */
    public void setTrackList(GenericList<AlbumTrack> tracks){
        this.tracks = tracks;
    }
    
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Album))
            return false;
        
        Album album = (Album)o;
        
        return this.title.equals(album.title);
    }       

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.title);
        return hash;
    }
}