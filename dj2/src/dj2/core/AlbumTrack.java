/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dj2.core;

import java.io.Serializable;

/**
 * AlbumTrack is a track that belongs to an album/concert.
 * @author HP-Pavilion
 */
public class AlbumTrack extends Track implements Serializable{

    /**
     * the album of the track.
     */
    public Album album;
	
    /**
     * Constructor.
     * @param title input
     * @param style input
     * @param type input
     * @param path input
     * @param duration input
     * @param artist input
     * @param album input
     */
    public AlbumTrack(String title, Style style, Type type, String path, int duration, Artist artist, Album album){
	super(title, style, type, path, duration, artist);
	this.album = album;
		}
	
    @Override
    public String toString(){
        return super.toString() + "   |   " + album.title;
    } 

    /**
     * modify the album.
     * @param album
     */
    public void setAlbum(Album album){
	this.album = album;
    }
}
