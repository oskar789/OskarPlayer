/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.titanplayer.bll.Song;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author oskarsanchez-chagollan
 */
public class SongTest {
    
    public SongTest() {
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
    public void getTitleTest(){
        Song mysong = new Song("1979", "Smashing Pumkins","c:/");
        assertEquals("1979", mysong.getTitle());
        
        
        
    }
}
