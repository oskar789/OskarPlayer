/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.titanplayer.bll.ControlPlayer;
import com.titanplayer.bll.Playlist;
import com.titanplayer.bll.Song;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author oskarsanchez-chagollan
 */
public class ControlPlayerTest {
    Song newSong1;
    Song newSong2;
    Song newSong3;
    Playlist myPlaylist;
    ControlPlayer myControlPlayer;
    
    
    
    public ControlPlayerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
       newSong1 = new Song( "Isolate", "Bender","c:/");
       newSong2 = new Song("South slide", "Moby", "c:/");
       newSong3 = new Song("Entersadman", "Metallica","c:/" );
        myPlaylist = new Playlist("Player Test");
        myPlaylist.addSong(newSong1);
        myPlaylist.addSong(newSong2);
        myPlaylist.addSong(newSong3);
        myControlPlayer = new ControlPlayer();
        myControlPlayer.loadPlaylist(myPlaylist);
        
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void getCurrentSongTest(){
       
        
        myPlaylist = new Playlist("skip");
        myControlPlayer = new ControlPlayer();
        Song mySong = new Song("entersadman", "Metallica", "c:/");
        myPlaylist.addSong(mySong);
        myControlPlayer.loadPlaylist(myPlaylist);
        assertEquals(mySong, myControlPlayer.getCurrentSong());
        
        
    }
    @Test
    public void skipNoSongTest(){
        assertTrue(myControlPlayer.skipSong().compareTo(newSong2) == 0x0 && myControlPlayer.skipSong().compareTo(newSong3) == 0x0 && myControlPlayer.skipSong().compareTo(newSong3) == 0x0);
    }
    
    @Test
    public void testGetNextSong()
    {
        assertTrue(myControlPlayer.skipSong().compareTo(newSong2) == 0x0 && myControlPlayer.skipSong().compareTo(newSong3) == 0x0);
    }
    @Test
    public void testPlay()
    {
        myControlPlayer.playSong();
        assertTrue(myControlPlayer.getIsPlaying());
    }
    @Test
    public void testStop()
    {
        myControlPlayer.playSong();
        boolean firstCheck = myControlPlayer.getIsPlaying();
        myControlPlayer.stopSong();
        assertTrue( !myControlPlayer.getIsPlaying() && firstCheck);
    }
    
}
