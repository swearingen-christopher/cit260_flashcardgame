/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flashcardgame.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author christopher.swearing
 */
public class Question implements Serializable {

    private String questionID; //GUID-based ID
    private String questionText; //This is the text of the question itself
    private Integer questionDifficulty;
    private Answer questionAnswer; //TODO:Eventually this should be an Array of possible answers
    private List<Answer> answersList = new ArrayList<>();
    public Question() {
    }

    public List<Answer> getAnswersList() {
        return answersList;
    }

    public void setAnswersList(List<Answer> answersList) {
        this.answersList = answersList;
    }


    public String getQuestionID() {
        return questionID;
    }

    public Integer getQuestionDifficulty() {
        return questionDifficulty;
    }

    public void setQuestionDifficulty(Integer questionDifficulty) {
        this.questionDifficulty = questionDifficulty;
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

    public Answer getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(Answer questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.questionID);
        hash = 67 * hash + Objects.hashCode(this.questionText);
        hash = 67 * hash + Objects.hashCode(this.questionAnswer);
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
        return Objects.equals(this.questionAnswer, other.questionAnswer);
    }

    @Override
    public String toString() {

        return "Question{" + "questionID=" + questionID 
                 + ", questionText=" + questionText 
                + ", questionAnswer=" + questionAnswer 
                + ", answersList=" + answersList + '}';

    }

    public String toJSON() {
        Gson gson = new Gson();
        
        return gson.toJson(this);

    }

}
