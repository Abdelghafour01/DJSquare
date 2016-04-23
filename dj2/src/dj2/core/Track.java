/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dj2.core;

import static dj2.persistence.PersistentCollection.collection;
import java.io.*;
import javax.sound.sampled.*;

/**
 * Music Track
 * @author HP-Pavilion
 */
public class Track implements Playable, Serializable{
    
    /**
     * state of the Track (Playing or not)
     */
    protected boolean trackState;
    
    /**
     * clip to be played
     */
    protected Clip myClip;
    /**
     * The title of the track
     */
    protected String title;

    /**
     * path of the track
     */
    protected String path;

    /**
     * The style of the track (ROCK, POP,...) see the Style 'enum' class.
     */
    protected Style style;

    /**
     * The Type of the track (single, album, concert).
     */
    protected Type type;

    /**
     * the duration of the track (in seconds).
     */
    protected int duration;

    /**
     * The artist of the track (should be created before creating the track).
     */
    protected Artist artist;

    /**
     *
     */
    
    /**
     * The constructor method initializes all the attributes of the object.
     * @param title input
     * @param style input
     * @param type input
     * @param path input
     * @param duration input
     * @param artist input
    */
    
    /**
     * The constructor method initializes all the attributes of the object.
     * @param title
     */
    public Track(String title){
        this.title = title;
    }
    
    /**
     *
     * @param title input
     * @param style input
     * @param type input
     * @param path input
     * @param duration input
     * @param artist input
     */ 
    public Track(String title, Style style, Type type, String path, int duration, Artist artist){
		this.title = title;
		this.style = style;
		this.type = type;
		this.path = path;
		this.duration = duration;
		this.artist = artist;
		}

    /**
     * Returns the title of the track.
     * @return
     */
    public String getTitle(){
		return this.title;
    }
    
    /**
     * returns the style of the track.
     * @return
     */
    public Style getStyle(){
        return this.style;
    }
    
    /**
     * returns the type of the track.
     * @return
     */
    public Type getType(){
        return this.type;
    }
    
    /**
     * returns the path of the track.
     * @return
     */
    public String getPath(){
        return this.path;
    }
    
    /**
     * returns the duration of the track (in seconds);
     * @return
     */
    public int getDuration(){
        return this.duration;
    }
    
    /**
     * returns the artist of the track.
     * @return
     */
    public Artist getArtist(){
        return this.artist;
    }

    /**
     * sets the title as entered in the parameter title.
     * @param title
     */
    public void setTitle(String title){
        this.title = title;
    }
    
    /**
     * modify the Style value.
     * @param style
     */
    public void setStyle(Style style){
        this.style = style;
    }
    
    /**
     * Modify the type value.
     * @param type
     */
    public void setType(Type type){
        this.type = type;
    }
    
    /**
     * Modify the path of the track.
     * @param path
     */
    public void setPath(String path){
        this.path = path;
    }
    
    /**
     * modify the duration of the track (in seconds).
     * @param duration
     */
    public void setDuration(int duration){
        this.duration = duration;
    }
    
    /**
     * sets the artist.
     * @param artist
     */
    public void setArtist(Artist artist){
        this.artist = artist;
    }
    /**
     * This function displays: The song: "Title" By Artist/Group: "Artist" is now playing...
     */
    @Override
    public void play(){
          try {
            // get the sound clip
            AudioInputStream myStream = AudioSystem.getAudioInputStream(new File(path));
            myClip = AudioSystem.getClip();
            myClip.open(myStream);
            AudioFormat format = myStream.getFormat();
            long frames = myStream.getFrameLength();
            duration = (int) ((frames) / format.getFrameRate());  
            
            myClip.start();
            trackState = true;
            
            if(!collection.recentlyPlayed.search(this))
                    collection.recentlyPlayed.add(this);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {}
	
            
    }
	
    /**
     * stop
     */
    public void stop(){
        myClip.stop();
        trackState = false;
    }
    /**
     * Returns information about the track.
     * @return
     */
    @Override
    public String toString(){
		return title + "      |      " + style + "     |     " + type + "    |    " + duration + "    |     " + artist.name;
	}

    /**
     *
     * @return
     */
    public boolean getTrackState(){
        return trackState;
    } 

    /**
     *
     * @param t input
     * @return
     */
    public boolean equals(Track t){
    
        return(this.title.equals(t.title));
    }
}