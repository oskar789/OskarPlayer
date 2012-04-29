/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.titanplayer.bll.UserAccount;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author oskarsanchez-chagollan
 */
public class UserAccountTest {
    
    public UserAccountTest() {
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
    public void testSetLoggedIn() // really an unnecessary test but here for completeness
    {
    UserAccount lap = new UserAccount();
    lap.setLoggedIn(true);
    boolean testLoggedIn = lap.getLoggedIn();
    lap.setLoggedIn(false);
    assertTrue(testLoggedIn == true && lap.getLoggedIn() == false);
    }
    
    @Test
    public void testUsernameReges()
    {
    UserAccount lap = new UserAccount();
    boolean test1 = lap.isValidUsername("Osksan");
    boolean test2 = lap.isValidUsername(" 3jk");
    assertTrue(test1 == true && test2 == false);
    }
    
    @Test
    public void testPasswordReges(){
        UserAccount lap = new UserAccount();
        boolean test1 = lap.isValidPassword("Tqwe23");
        boolean test2 = lap.isValidPassword("23gt");
        assertTrue(test1 == true && test2 == false);
    }
}
