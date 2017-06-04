/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flashcardgame.control;

import byui.cit260.flashcardgame.model.Player;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author christopher.swearing
 */
public class PlayerControlTest {
    
    public PlayerControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createPlayer method, of class PlayerControl.
     */
    @Test
    public void testCreatePlayer_0args() {
        System.out.println("createPlayer");
        PlayerControl instance = new PlayerControl();
        Player expResult = null;
        Player result = instance.createPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPlayer method, of class PlayerControl.
     */
    @Test
    public void testCreatePlayer_String() {
        System.out.println("createPlayer");
        String playerName = "";
        PlayerControl instance = new PlayerControl();
        Player expResult = null;
        Player result = instance.createPlayer(playerName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer method, of class PlayerControl.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        String playerName = "";
        PlayerControl instance = new PlayerControl();
        Player expResult = null;
        Player result = instance.getPlayer(playerName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listPlayers method, of class PlayerControl.
     */
    @Test
    public void testListPlayers() {
        System.out.println("listPlayers");
        PlayerControl instance = new PlayerControl();
        List<Player> expResult = null;
        List<Player> result = instance.listPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePlayer method, of class PlayerControl.
     */
    @Test
    public void testDeletePlayer_String() {
        System.out.println("deletePlayer");
        String playerID = "";
        PlayerControl instance = new PlayerControl();
        String expResult = "";
        String result = instance.deletePlayer(playerID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePlayer method, of class PlayerControl.
     */
    @Test
    public void testDeletePlayer_Player() {
        System.out.println("deletePlayer");
        Player player = null;
        PlayerControl instance = new PlayerControl();
        String expResult = "";
        String result = instance.deletePlayer(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
