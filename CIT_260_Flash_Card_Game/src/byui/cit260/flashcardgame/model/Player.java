/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flashcardgame.model;

import java.io.Serializable;
import java.util.Objects;
import org.json.simple.JSONObject;

/**
 *
 * @author jsmoo
 */
public class Player implements Serializable{
    
    // class instance variables
    /**
     * The playerID is a GUID value (e.g. 2a260c93-3722-40d5-867a-6ebc0bcf4dfc) 
     * that is assigned when a new Player object is created.
     * @see https://en.wikipedia.org/wiki/Globally_Unique_Identifier
     * @see https://www.guidgenerator.com/online-guid-generator.aspx
     * */
    private String playerID; 
    private String name;
    private double bestTime;
    private double score;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }
        

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.playerID);
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.score) ^ (Double.doubleToLongBits(this.score) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "playerID=" + playerID + ", name=" + name + ", bestTime=" + bestTime + ", score=" + score + '}';
    }
        
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.score) != Double.doubleToLongBits(other.score)) {
            return false;
        }
        if (!Objects.equals(this.playerID, other.playerID)) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
    public String toJSON(){
        JSONObject obj = new JSONObject();
        
        obj.put("playerID", this.playerID);
        obj.put("name", this.name);
        obj.put("bestTime", this.bestTime);
        obj.put("score", this.score);
        
        return obj.toJSONString();
    }
    
}
