/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dj2.core;

import java.io.Serializable;

/**
 * Group is inherited from artist + has a list of members.
 * @author HP-Pavilion
 */
public class Group extends Artist implements Serializable{

    /**
     * the number of members in the group.
     */
    public int numMembers;
    
    /**
     *List of Artists
     */
    public GenericList<Artist> list;

    /**
     * initializes the group.
     * @param name input
     * @param imgpath input
     * @param bio input
     * @param singles input
     * @param albums input
     * @param concerts input
     * @param numAlbums input
     * @param numSingles input
     * @param numConcerts input
     * @param numMembers input
     * @param list input
     */
    public Group(String name, String imgpath, String bio, GenericList<Track> singles, GenericList<Album> albums, GenericList<Concert> concerts, int numAlbums, int numSingles, int numConcerts, int numMembers, GenericList<Artist> list) {
        super(name, imgpath, bio, singles, albums, concerts, numAlbums, numSingles, numConcerts);
        this.numMembers = numMembers;
        this.list = list;
    }
	
        @Override
	public String toString(){
		return super.toString() + " | Number of Artists : " + numMembers;
		
		
		}
			
}