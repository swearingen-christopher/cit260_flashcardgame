/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flashcardgame.model;
 
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author christopher.swearing
 */
public class Answer implements Serializable{

    private String answerText;
    private boolean answerCorrect;
    
    public Answer() {
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public boolean isAnswerCorrect() {
        return answerCorrect;
    }

    public void setAnswerCorrect(boolean answerCorrect) {
        this.answerCorrect = answerCorrect;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.answerText);
        hash = 47 * hash + (this.answerCorrect ? 1 : 0);
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
        final Answer other = (Answer) obj;
        if (this.answerCorrect != other.answerCorrect) {
            return false;
        }
        return Objects.equals(this.answerText, other.answerText);
    }

    @Override
    public String toString() {
        return "Answer{" + "answerText=" + answerText + ", answerCorrect=" + answerCorrect + '}';
    }
    
    
}