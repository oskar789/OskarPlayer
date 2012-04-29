/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.titanplayer.bll.Mp3Filter;
import java.io.File;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author oskarsanchez-chagollan
 */
public class Mp3FilterTest {
    
    public Mp3FilterTest() {
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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testAccept()
    {
        File file = new File("test.mp3");
        File file2 = new File("test.Mp3");
        File file3 = new File("test.MP3");
        File file4 = new File("test.mP3");
        Mp3Filter myMp3filter = new Mp3Filter();
        assertTrue(myMp3filter.accept(file) && myMp3filter.accept(file2) && myMp3filter.accept(file3) && myMp3filter.accept(file4));
    }
    
    @Test
    public void testAcceptDoesNotAcceptNonMp3()
    {
        File file = new File("wish.jpg");
        File file2 = new File("mp3.doc");
        Mp3Filter myMp3filter = new Mp3Filter();
        assertFalse(myMp3filter.accept(file) && myMp3filter.accept(file2));
    }
}
