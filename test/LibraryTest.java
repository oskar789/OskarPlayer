/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.titanplayer.bll.Library;
import com.titanplayer.bll.Song;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author oskarsanchez-chagollan
 */
public class LibraryTest {
    public Library myLibrary;
    
    Song songs1;
    Song songs2;
    Song songs3;
    Song songs4;
    
    public LibraryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        songs1 = new Song ("entersadman", "metallica", "c:/");
        songs2 = new Song("nevermind","nirvana", "c:/");
        songs3 = new Song("heart shaped box", "nirvana", "c:/");
        songs4 = new Song("1979","Smashing Pumkins", "c:/");
        myLibrary = new Library();
        myLibrary.addSong(songs1);
        myLibrary.addSong(songs2);
        myLibrary.addSong(songs3);
        myLibrary.addSong(songs4);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void emptyLibraryTest(){
        myLibrary = new Library();
        assertEquals(0,myLibrary.songCount());         
    }
    
    @Test
    public void addSongIncrementTest(){
        myLibrary.addSong(new Song("title", "artist","c:/"));
        assertEquals(5,myLibrary.songCount());
    }
    
    
    @Test
    public void removeSongCountTest(){
        myLibrary.removeSong(songs1);
        assertEquals(3,myLibrary.songCount());
         
    }
    
    @Test 
    public void removeCorrectSongTest(){
        myLibrary.removeSong(songs1);
        
        assertFalse( myLibrary.songExist(songs1) );
    }
    
    @Test
    public void testSortByArtist() 
    {
        
        myLibrary.sortByTitle();
        myLibrary.sortByArtist(); 
        List<Song> compare = new ArrayList<Song>(); 
        compare.add(songs1);
        compare.add(songs3);
        compare.add(songs2);
        compare.add(songs4);
        assertArrayEquals(compare.toArray(), myLibrary.getAllSongs().toArray());
    }
    
    @Test
    public void testSortByTitle() 
    {
        
        myLibrary.sortByArtist();
        myLibrary.sortByTitle(); 
        List<Song> compare = new ArrayList<Song>(); 
        compare.add(songs4);
        compare.add(songs1);
        compare.add(songs3);
        compare.add(songs2);
        assertArrayEquals(compare.toArray(), myLibrary.getAllSongs().toArray());
       
        //
    }
    
    @Test
    public void testGetAllSongsInLibrary()
    {
        
        List<Song> compare = new ArrayList<Song>();
        compare.add(songs4);
        compare.add(songs1);
        compare.add(songs3);
        compare.add(songs2);
        assertArrayEquals(compare.toArray(), myLibrary.getAllSongs().toArray());
    }
}