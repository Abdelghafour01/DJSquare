/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dj2.test;

import dj2.core.*;
import static dj2.persistence.PersistentCollection.collection;
/**
 *
 * @author HP-Pavilion
 */
public class Test {

    /**
     * @param args the command line arguments
     */

   public static void main(String args[]) {
  
        GenericList<Track> t1 = new GenericList<>();
        GenericList<Track> t2 = new GenericList<>();
        GenericList<Album> a1 = new GenericList<>();
        GenericList<Album> a2 = new GenericList<>();
        GenericList<Concert> c1 = new GenericList<>(); 
        GenericList<Concert> c2 = new GenericList<>();
       
        
        Artist artist1 = new Artist("Artist1");
        Artist artist2 = new Artist("Artist2", "C:\\Artist2.jpg", "pop artist", t2, a1, c1, 10, 15, 4);
        Artist artist3 = new Artist("Artist3", "C:\\Artist3.jpg", "rock artist", t1, a1, c1, 1, 1, 4);
        
        Album album1 = new Album("album1", "C:\\album1.jpg", "good album", "21 June 2015", 6, artist1);
        Concert concert1 = new Concert("concert1", "C:\\concert1.jpg", "good album", "21 June 2015", 6, artist1, "Rabat");
        
        GenericList<Artist> list1 = new GenericList<>();
           
        GenericList<Track> myplaylist = new GenericList<>();
        GenericList<Track> myplaylist2 = new GenericList<>();
       
        
        Track track1 = new Track("Drop it Like it's Hot!", Style.POP, Type.SINGLE ,"C:\\1.wav", 300 , new Artist("Snoop Dogg"));
        Track track2 = new AlbumTrack("Track2", Style.ROCK, Type.ALBUM ,"C:\\track1.mp3", 300 , artist2, album1);
        Track track3 = new AlbumTrack("Track3", Style.DANCE, Type.CONCERT ,"C:\\track1.mp3", 300 , artist2, concert1);
        
        list1.add(artist2);
       list1.add(artist3);
       track1.play();
        track2.play();
        System.out.println(track1);
        
       Group group1 = new Group("Group1", "C:\\Group1", "awesome group", t2, a2, c2, 1, 2, 3, 2, list1);
       System.out.println(group1);
       
       System.out.println(group1.list);
       
       myplaylist.add(track2);
       myplaylist.add(track1);
       myplaylist.add(track3);
       
       myplaylist.display();
       System.out.println("////////////////////////Recently played////////////////////");
       collection.recentlyPlayed.display();
  
    try{
    myplaylist.remove(track1);
    }catch(EmptyListException e){
       System.out.println(e);
    }
 
               }
    
}
