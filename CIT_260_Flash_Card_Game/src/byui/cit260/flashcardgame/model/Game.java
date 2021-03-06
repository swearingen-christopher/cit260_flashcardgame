package byui.cit260.flashcardgame.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by EgbertRG on 5/23/2017.
 * 
 * Change Log:
 * 2017-06-01 Chris Swearingen
 *  Changed the Game.gameID to a String to work with the UUID ID Generator @see http://www.javapractices.com/topic/TopicAction.do?Id=56
 * 2017-06-03 Chris Swearingen
 *  Finished the toJSON TODO's for JSON file writing
 * 
 * 2017-06-10 Chris
 *  Updated the toJSON method to use GSON.
 *
 */


public class Game implements Serializable {

    private String gameID;
    private Subject subject;
    private Player player;
    public Game() {
    }

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.gameID);
        hash = 89 * hash + Objects.hashCode(this.subject);
        return hash;
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.gameID, other.gameID)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        return Objects.equals(this.player, other.player);
    }



    @Override
    public String toString() {
        return "Game{" +
                "gameID=" + gameID +
                ", subject=" + subject +
                ", player=" + player +
                '}';
    }

    public String toJSON(){
        Gson gson = new Gson();
        
        return gson.toJson(this);
        
    }
}
