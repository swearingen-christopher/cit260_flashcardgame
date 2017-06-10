/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flashcardgame.control;

import byui.cit260.flashcardgame.model.Game;
import byui.cit260.flashcardgame.model.Player;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author christopher.swearing
 */
public class FileControl {
    
    public String writeNewPlayerDataFile(Player playerData, Game gameData){
        //status message text
        String status;
        status = "Save operation in progress";
        
        System.out.println(status);
        
        //create the file path and filename from the player's UUID
        String filePath = "./JsonDataFiles/PlayerData/";
               filePath += playerData.getPlayerID();
               filePath += ".json";
               
        //attempt to write the data to a JSON text file
        try (FileWriter file = new FileWriter(filePath)) {

            file.write(playerData.toJSON());
            file.flush();
            
            status = "Player game saved successfully to ";
            status += filePath;  //concatenating like this removes annoying binary concat warning

        } catch (IOException e) {
            System.out.println(e.getMessage());
            status = "Player game could not be saved.\n"+e.getMessage();
        }
        
        System.out.println(status);
        return status;    
    }
    
    public JSONObject getPlayerDataFile(String playerUUID){

        //TODO: change this to parse the file using GSON classes
    
        //build the filepath from the player's UUID
        String filePath = "./JsonDataFiles/PlayerData/" + playerUUID +".json";
        JSONObject playerJsonData = new JSONObject();        
        JSONParser parser = new JSONParser();
        
        try {
 
            Object obj;
            obj = parser.parse(new FileReader(filePath));
 
            playerJsonData = (JSONObject) obj;
 
        } catch (IOException | ParseException e) {
            System.out.println(e.getMessage());
        }
        
        return playerJsonData;
    }
    
}
