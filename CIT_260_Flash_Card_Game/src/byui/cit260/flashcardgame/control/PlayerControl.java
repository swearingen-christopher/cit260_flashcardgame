package byui.cit260.flashcardgame.control;

import byui.cit260.flashcardgame.model.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by EgbertRG on 5/23/2017.
 * Change log:
 * 2017-06-01 Chris Swearingen built out the PlayerControl
 */
public class PlayerControl {
    /**
    * Returns a Player object. 
    *
    * @return      a Player object
    * @see         Player
    */
    public Player createPlayer(){
        Player player = new Player();
        
        return player;    
    }
    
    /**
     * Returns a Player object
     * @param playerName
     * @return a Player object
     * @author cswearingen
     * 
     */
    public Player createPlayer(String playerName){
        Player player = new Player();
        
        player.setName(playerName);
        player.setPlayerID(UUID.randomUUID().toString());
        
        return player;    
    }
    
    /**
     * Attempts to retrieve a player from the JSON data file by using the name, if found
     * then the method loads the details into a Player object, and returns the Player object
     * @param playerName
     * @return Player
     * @author cswearingen
     * 
     */
    public Player getPlayer(String playerName){
        Player player = new Player();
        
        //TODO: Use the playerName value to look for a player in the PlayerData.json file
        
        return player;
    }
    
    /**
     * Retrieves all of the players stored in the PlayerData.json file, then loads the data
     * into a List of Player objects
     * @return List of Player
     */
    public List<Player> listPlayers(){
        List<Player> players = new ArrayList<>();
        
        Player player = new Player();
        
        //TODO: Read the PlayerData.json file to retrieve all the players stored, loop to create a Player object for each player 
        //in the data file add the players to the list, and return the list
        
        players.add(player);
        
        return players;        
    }
    
    /**
     * Removes a Player from the PlayerData.json file if found by the playerID value
     * @param playerID
     * @return Status message indicating operation success/failure
     */
    public String deletePlayer(String playerID){
        String status = null;
        
        //TODO: Delete the player from the JSON data file.  
        //TODO: Delete the player Object from memory?
        
        return status;
    }
    
    /**
     * Removes a Player from the PlayerData.json file if found by the playerID value from a Player object
     * @param player
     * @return Status message indicating operation success/failure
     */    
    public String deletePlayer(Player player){
        String status = null;
        
        //TODO: Delete the player from the JSON data file.  
        //TODO: Delete the player Object from memory?
        
        return status;
    }
    
}
