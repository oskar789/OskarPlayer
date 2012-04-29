/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titanplayer.bll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author oskarsanchez-chagollan
 */
public class Playlist {
    
    
    private String name;
    private List<Song> songs;
    
    public Playlist(String playlistName  )
    {
       name = playlistName;
       songs = new ArrayList();
    } 
    public String getName()
    {
        return this.name;
    }
    public boolean songExist(Song lookForSong)
    {
        return songs.contains(lookForSong);
        
        
//        ArrayList<Song> s = (ArrayList<Song>) L.getAllSongs();
//        for(int i=0;i<s.size();i++)
//        {
//            Song temp = s.get(i);
//            String tempName = temp.getTitle();
//            if(tempName.equalsIgnoreCase(title))
//                return temp;
//        }
//         System.out.println("Song Not Found in Libraby.");
//         return null;
    }
    public void addSong(Song inputSong)
    {
        
        
       songs.add(inputSong);
            
    }
    
    public List<Song> getAllSong()
    {
        return songs;
    }
    
    public int listCount(){
        return songs.size();
    }

    public Song getSongFromIndex(int indexIntoPlaylist) {
        return songs.get(indexIntoPlaylist);
    }
    
}
