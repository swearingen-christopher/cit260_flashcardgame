package byui.cit260.flashcardgame.control;

import byui.cit260.flashcardgame.model.Subject;

/**
 * Created by EgbertRG on 5/23/2017.
 */
public class SubjectControl {
    
    public Subject createSubject(){
        Subject subject = new Subject();
             
        subject.setSubjectID(UUIDGenerator.generateID());
        
        return subject;
    }
    
    public Subject createSubject(String subjectName){
        Subject subject = new Subject();
        
        subject.setSubjectName(subjectName);
        
        return subject;
    }
    
}
