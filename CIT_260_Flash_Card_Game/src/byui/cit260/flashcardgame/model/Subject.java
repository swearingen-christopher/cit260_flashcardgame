package byui.cit260.flashcardgame.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by EgbertRG on 5/11/2017.
 */

public class Subject implements Serializable {
    private String subjectID;
    private String subjectName;
    private String subjectDescription;
    private Question question;//Allows only ONE question

    public List<Question> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<Question> questionsList) {
        this.questionsList = questionsList;
    }
    private List<Question> questionsList = new ArrayList<>(); //Allows 0:M questions (each with 0:M answers)
    
    public Subject() {
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
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

        Subject subject = (Subject) o;

        if (subjectID != null ? !subjectID.equals(subject.subjectID) : subject.subjectID != null) return false;
        if (subjectName != null ? !subjectName.equals(subject.subjectName) : subject.subjectName != null) return false;
        if (subjectDescription != null ? !subjectDescription.equals(subject.subjectDescription) : subject.subjectDescription != null)
            return false;
        return question != null ? question.equals(subject.question) : subject.question == null;
    }

    @Override
    public int hashCode() {
        int result = subjectID != null ? subjectID.hashCode() : 0;
        result = 31 * result + (subjectName != null ? subjectName.hashCode() : 0);
        result = 31 * result + (subjectDescription != null ? subjectDescription.hashCode() : 0);
        result = 31 * result + (question != null ? question.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectID='" + subjectID + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectDescription='" + subjectDescription + '\'' +
                ", question=" + question +
                ", questionsList=" + questionsList +
                '}';
    }
}
