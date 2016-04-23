/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dj2.core;

import java.io.Serializable;

/**
 * Collection of the data entered. contains lists of tracks, artists, albums, artists.
 * @author Pavilion
 */
public class Collection implements Displayable, Serializable{

/**Collection class collects all the music tracks artists albums and concerts that are created*/
	/**
	 *  serial Version ID
	 */
	private transient static final long serialVersionUID = 1L;

    /**
     * reference of the Collection
     */

    /**
     * recently Played playlist Declaration.
     */
        public static GenericList<Track> recentlyPlayed = new GenericList<>();

    /**
     *track list Declaration
     */
    public static GenericList<Track> allTracks = new GenericList<>();

    /**
     * artists Declaration
     */
    public static GenericList<Artist> allArtists = new GenericList<>();
	
	/**private constructor to keep users from instantiating the class more than once*/
	public Collection(){
                recentlyPlayed = new GenericList<>();
		allTracks = new GenericList<>();
		allArtists = new GenericList<>();
		
	}
	
	/**method that makes sure the class is instantiated only once.
     * @return e*/
	public Collection getCollection(){
		
		return this;
		
	}
	
	/** adds a track to the list of all tracks
	 * 
     * @param track the track to be added
	 */
	public void addTrack(Track track){
		allTracks.add(track);
	}
	
	/** adds an artist to the list of all artists
	 * 
	 * @param artist the artist to be added
	 */
	public void addArtist(Artist artist){
		allArtists.add(artist);
	}
	
	/**search for an artist inside the collection
	 * 
	 * @param name the name of the wanted artist
	 * @return the wanted artist
	 */
	public Artist searchForArtist(String name){
		return allArtists.search(name);
	}
	
    /**
     * display
     */
    public void display(){
	}


}
