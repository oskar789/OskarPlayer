/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titanplayer.bll;

/**
 *
 * @author oskarsanchez-chagollan
 */
public class Song implements Comparable<Song>{
    private String title;
    private int time;
    private String artist;
    private String genre;
    private String path;
    
    public Song(){
        
    }

    public Song(String title, String artist, String path) {
        this.title = title;
        
        this.artist = artist;
        this.path = path;
    
    }

    public String getPath() {
        return path;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }
    
    @Override
    public boolean equals(Object song){
        Song songTwo = (Song) song;
        if (this == songTwo){
            return true;
        }
        return songTwo.getArtist().equals(this.getArtist()) && songTwo.getTitle().equals(this.getTitle());
        
    }
    
    @Override
    public int compareTo(Song songToCompare)
    {
    int result = this.getArtist().compareTo(songToCompare.getArtist());
     if(result == 0)
     {
         result = this.getTitle().compareTo(songToCompare.getTitle());
     }
    return result;
    }
    
    @Override
    public String toString()
    {
        return artist + " : " + title + "\n";
    }
    
    
}
