package byui.cit260.flashcardgame.model;

import java.io.Serializable;

/**
 * Created by EgbertRG on 5/13/2017.
 */
public class PlayerQuestionHistory implements Serializable {
    private Subject subject;
    private Player player;
    private Question question;

    public PlayerQuestionHistory() {
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

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayerQuestionHistory that = (PlayerQuestionHistory) o;

        if (subject != null ? !subject.equals(that.subject) : that.subject != null) return false;
        if (player != null ? !player.equals(that.player) : that.player != null) return false;
        return question != null ? question.equals(that.question) : that.question == null;
    }

    @Override
    public int hashCode() {
        int result = subject != null ? subject.hashCode() : 0;
        result = 31 * result + (player != null ? player.hashCode() : 0);
        result = 31 * result + (question != null ? question.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PlayerQuestionHistory{" +
                "subject=" + subject +
                ", player=" + player +
                ", question=" + question +
                '}';
    }
}
