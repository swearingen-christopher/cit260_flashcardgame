/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit_260_flash_card_game;

import byui.cit260.flashcardgame.control.FileControl;
import byui.cit260.flashcardgame.control.UUIDGenerator;
import byui.cit260.flashcardgame.model.Answer;
import byui.cit260.flashcardgame.model.Game;
import byui.cit260.flashcardgame.model.Player;
import byui.cit260.flashcardgame.model.Question;
import java.util.ArrayList;
import java.util.List;
import byui.cit260.flashcardgame.model.Subject;
import byui.cit260.flashcardgame.model.PlayerGame;
import byui.cit260.flashcardgame.view.StartProgramView;

/**
 *
 * @author jsmoo
 */
public class CIT_260_Flash_Card_Game {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create StartProgramViewOrig and display the start program view//
        StartProgramView StartProgramView = new StartProgramView();
        StartProgramView.displayStartProgramView();
        
        
        Player playerOne = new Player();
        
        playerOne.setName("Austin Powers");
        playerOne.setBestTime(10.00);
        playerOne.setPlayerID(UUIDGenerator.generateID());
        playerOne.setScore(100);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //create an example question object
        Question question1 = new Question();
        //load the example question object
        question1.setQuestionID("Question1");
        question1.setQuestionText("What is the answer to life, the universe, and everything?");
        
        //create some Answer objects
        Answer answer1 = new Answer();
        Answer answer2 = new Answer();
        //load the Answer objects with data
        answer1.setAnswerText("42");
        answer1.setAnswerCorrect(true);
        answer2.setAnswerText("Uhhh... sushi?");
        answer2.setAnswerCorrect(false);
        
        //Create a list for holding multiple Answers
        List<Answer> questionAnswers = new ArrayList<>();
        //Add the example Answer objects to the list
        questionAnswers.add(answer1);
        questionAnswers.add(answer2);

        //Add the list of example Answers to the Question object's AnswersList attribute
        question1.setAnswersList(questionAnswers);

        //Add a single answer for demo-ing
        question1.setQuestionAnswer(answer1);
        
        //Echo out the Question object's data
        System.out.println(question1);
        
        Subject subject1 = new Subject();
        subject1.setSubjectID(UUIDGenerator.generateID());
        subject1.setSubjectDescription("An Introduction to Object Oriented Programming");
        subject1.setSubjectName("JAVA I");
        subject1.setQuestion(question1);

        String subjectInfo = subject1.toString();
        System.out.println(subjectInfo);

        PlayerGame playerQuestionHistory1 = new PlayerGame();
        playerQuestionHistory1.setPlayer(playerOne);
        playerQuestionHistory1.setQuestion(question1);
        playerQuestionHistory1.setSubject(subject1);

        String playerQuestionHistoryInfo = playerQuestionHistory1.toString();
        System.out.println(playerQuestionHistoryInfo);
        
        
        Game gameData = new Game();
        
        gameData.setPlayer(playerOne);
        gameData.setSubject(subject1);
        gameData.setGameID(UUIDGenerator.generateID());
        
        testFileWriter(playerOne, gameData);
    
    
    
    
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        CIT_260_Flash_Card_Game.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        CIT_260_Flash_Card_Game.player = player;
    }
    
    
    
    private static void testFileWriter(Player playerData, Game gameData){
        FileControl fileWriter = new FileControl();
        
        fileWriter.writeNewPlayerDataFile(playerData, gameData);
        
    }
    
}
