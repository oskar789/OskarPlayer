/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titanplayer.bll;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oskarsanchez-chagollan
 */
public class ControlPlayer {
    private Playlist currentPlaylist;
    private int indexIntoPlaylist;
    private Song playingSong;
    private boolean isPlaying;
    
    public Song skipSong()
    {
       indexIntoPlaylist ++;
       return getCurrentSong();
    }
    public void previousSong()
    {
        
    }
    public void  pauseSong()
    {
        
    }
    public void stopSong()
    {
     isPlaying = false;   
    }
    public Song getCurrentSong() {

        if (indexIntoPlaylist < 0) {
            indexIntoPlaylist = 0;
        }
        if (indexIntoPlaylist >= currentPlaylist.listCount()) {
            indexIntoPlaylist = currentPlaylist.listCount() - 1;
        }
        return currentPlaylist.getSongFromIndex(indexIntoPlaylist);

//        return currentPlaylist.getSongFromIndex(indexIntoPlaylist);
    }
    public void loadPlaylist(Playlist playlistToLoad){
        currentPlaylist = playlistToLoad;
        indexIntoPlaylist = 0;
        
    }

    public void playSong() {
        playingSong = getCurrentSong();
        isPlaying = true;
                
                
               
    }
    public boolean getIsPlaying()
    {
        return isPlaying;
    }

    
}
