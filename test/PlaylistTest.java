/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.titanplayer.bll.Playlist;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author oskarsanchez-chagollan
 */
public class PlaylistTest {
    
    public PlaylistTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void emptyListTest() {
        Playlist emptyList = new Playlist("Zero");
        assertEquals(0, emptyList.listCount());
    }

}
