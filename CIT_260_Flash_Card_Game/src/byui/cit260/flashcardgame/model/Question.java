/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flashcardgame.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author christopher.swearing
 */
public class Question implements Serializable{
    
    private String questionID; //GUID-based ID
    private String questionText; //This is the text of the question itself
    private Answer[] questionAnswers;

    public Question() {
    }

    public String getQuestionID() {
        return questionID;
    }

    public void setQuestionID(String questionID) {
        this.questionID = questionID;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Answer[] getQuestionAnswers() {
        return questionAnswers;
    }

    public void setQuestionAnswers(Answer[] questionAnswers) {
        this.questionAnswers = questionAnswers;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.questionID);
        hash = 41 * hash + Objects.hashCode(this.questionText);
        hash = 41 * hash + Arrays.deepHashCode(this.questionAnswers);
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
        final Question other = (Question) obj;
        if (!Objects.equals(this.questionID, other.questionID)) {
            return false;
        }
        if (!Objects.equals(this.questionText, other.questionText)) {
            return false;
        }
        if (!Arrays.deepEquals(this.questionAnswers, other.questionAnswers)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "questionID=" + questionID + ", questionText=" + questionText + ", questionAnswers=" + questionAnswers + '}';
    }
    
    
}
