package byui.cit260.flashcardgame.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.simple.JSONObject;

/**
 * Created by EgbertRG on 5/11/2017.
 */
public class Subject implements Serializable {

    private String subjectID;
    private String subjectName;
    private String subjectDescription;
    private Integer difficultyLevel;

    public Integer getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(Integer difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.subjectID);
        hash = 29 * hash + Objects.hashCode(this.subjectName);
        hash = 29 * hash + Objects.hashCode(this.subjectDescription);
        hash = 29 * hash + Objects.hashCode(this.difficultyLevel);
        hash = 29 * hash + Objects.hashCode(this.questionsList);
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
        final Subject other = (Subject) obj;
        if (!Objects.equals(this.subjectID, other.subjectID)) {
            return false;
        }
        if (!Objects.equals(this.subjectName, other.subjectName)) {
            return false;
        }
        if (!Objects.equals(this.subjectDescription, other.subjectDescription)) {
            return false;
        }
        if (!Objects.equals(this.difficultyLevel, other.difficultyLevel)) {
            return false;
        }
        if (!Objects.equals(this.questionsList, other.questionsList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Subject{" + "subjectID=" + subjectID + ", subjectName=" + subjectName + ", subjectDescription=" + subjectDescription + ", difficultyLevel=" + difficultyLevel + ", questionsList=" + questionsList + '}';
    }


 
    @Deprecated
    public String toJSON() {
        JSONObject obj = new JSONObject();

        obj.put("subjectID", this.subjectID);
        obj.put("subjectName", this.subjectName);
        obj.put("subjectDescription", this.subjectDescription);
        obj.put("questionsList", this.questionsList);

        return obj.toJSONString();

    }
    
    
    public String toJson(){
        Gson gson = new Gson();
        
        return gson.toJson(this);
        
    }

}
