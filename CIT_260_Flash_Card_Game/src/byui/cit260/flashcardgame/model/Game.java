package byui.cit260.flashcardgame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by EgbertRG on 5/23/2017.
 */


public class Game implements Serializable {
    public Game() {
    }

    private int gameID;
    private Subject subject;
    private Player player;

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        if (gameID != game.gameID) return false;
        if (!subject.equals(game.subject)) return false;
        return player.equals(game.player);
    }

    @Override
    public int hashCode() {
        int result = gameID;
        result = 31 * result + subject.hashCode();
        result = 31 * result + player.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameID=" + gameID +
                ", subject=" + subject +
                ", player=" + player +
                '}';
    }
}
