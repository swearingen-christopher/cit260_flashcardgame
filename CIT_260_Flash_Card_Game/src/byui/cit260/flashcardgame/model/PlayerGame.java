package byui.cit260.flashcardgame.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;

/**
 * Created by EgbertRG on 5/13/2017.
 */
public class PlayerGame implements Serializable {
    private Subject subject;
    private Player player;
    private Question question;//Allows only ONE question
    private List<Question> questionsList = new ArrayList<>(); //Allows 0:M questions (each with 0:M answers)

    public List<Question> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<Question> questionsList) {
        this.questionsList = questionsList;
    }
    

    public PlayerGame() {
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

        PlayerGame that = (PlayerGame) o;

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
                ", questionList=" + questionsList +
                '}';
    }

    public String toJSON() {
        JSONObject obj = new JSONObject();

        obj.put("player",this.player.toJSON());
        obj.put("questions", this.questionsList);
        obj.put("", this.subject);
        
        return obj.toJSONString();

    }



}
