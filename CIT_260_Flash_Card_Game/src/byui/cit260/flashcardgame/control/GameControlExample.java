/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flashcardgame.control;

import byui.cit260.flashcardgame.model.Game;
import byui.cit260.flashcardgame.model.Player;
import byui.cit260.flashcardgame.model.PlayerQuestionHistory;
import byui.cit260.flashcardgame.model.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author christopher.swearing
 */
public class GameControlExample {
    public Game createGame(Player player, Subject subject) {
        Game game = new Game();
        
        game.setGameID(UUID.randomUUID().toString());
        game.setPlayer(player);
        game.setSubject(subject);
        
        return game;
    }

    public Game getGame(String gameID) {
    /** 
     * @descrition this function should use the gameID (UUID) to pull the game data from 
     *    the game data JSON file, load the data into a Game object, and then return the 
     *    game object
    */
        Game game = new Game();
    
        //TODO: Open the GameData.json file, locate the game by the gameID, load the details into a Game object
        
        return game;
    }

    public List<Game> listIncompleteGames(Player playerID) {
        List<Game> games = new ArrayList<>();
        //TODO: Read the GameData.json file to retrieve a list of games for the given playerID value
        return games;
    }

    public String saveGame(Game gameID) {
        String saveStatus = null;
        //TOOD: Save the game information to GameData.json, and then return a message of whether the save operation succeeded or failed
        return saveStatus;
    }

    public String deleteGame(Game gameID) {
        String deleteStatus = null;
        //TODO: Remove the game data from GameData.json, and return a message indicating whether the operation succeeded or failed
        
        return deleteStatus;    
    }

    public int updateScore(PlayerQuestionHistory playerQuestionHistory) {
        int score = 0;
        //TODO: Calculate the score, and return the value to be updated in the Game object
        return score;
    }

}
