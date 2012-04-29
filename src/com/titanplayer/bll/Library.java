/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titanplayer.bll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author oskarsanchez-chagollan
 */
public class Library {

    private TreeSet<Song> songs;

    public Library() {
        songs = new TreeSet<Song>();
    }

    public boolean addSong(Song songToAdd) {
        if (!songExist(songToAdd)) {
            songs.add(songToAdd);
            return true;
        }
        return false;



    }

    public int songCount() {
        return songs.size();
    }

    public void removeSong(Song songtoRemove) {
        songs.remove(songtoRemove);
    }

    public TreeSet<Song> getAllSongs() {
        return songs;
    }

    public boolean songExist(Song lookForSong) {
        return songs.contains(lookForSong);

    }

    public void sortByArtist() {
        ByArtist comp = new ByArtist();
        TreeSet<Song> newSet = new TreeSet<Song>(comp);
        newSet.addAll(songs);
        songs = newSet;
    }

    public void sortByTitle() {
        ByTitle comp = new ByTitle();
        TreeSet<Song> newSet = new TreeSet<Song>(comp);
        newSet.addAll(songs);
        songs = newSet; 
    }

    public class ByArtist implements Comparator<Song> {

        @Override
        public int compare(Song song1, Song song2) {
            int result = song1.getArtist().compareToIgnoreCase(song2.getArtist());
            if (result == 0) {
                result = song1.getTitle().compareToIgnoreCase(song2.getTitle());
            }
            return result;
        }
    }

    public class ByTitle implements Comparator<Song> {

        @Override
        public int compare(Song song1, Song song2) {
            int result = song1.getTitle().compareToIgnoreCase(song2.getTitle());
            if (result == 0) {
                result = song1.getArtist().compareToIgnoreCase(song2.getArtist());
            }
            return result;

        }
    }
}