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
import byui.cit260.flashcardgame.model.PlayerGame;
import byui.cit260.flashcardgame.model.Question;
import byui.cit260.flashcardgame.model.Subject;
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

        /*
        Creating the various model objects, and echo back the JSON representation
        so that I can test the toJSON methods in each class, as well as generate
        a sample JSON file for PlayerData, GameData, SubjectData, and GameHistory files
        */
         generateTestPlayer();

        Question questionOne = generateTestQuestion();
        Question questionTwo = generateTestQuestion();
        
        List<Question> questionsList = new ArrayList<>();
        
        questionsList.add(questionOne);
        questionsList.add(questionTwo);        
        
        Subject subject = generateTestSubject(questionsList);

        PlayerGame playerGame = new PlayerGame();
        playerGame.setPlayer(playerOne);
        playerGame.setQuestionsList(questionsList);
        playerGame.setSubject(subject);
        
        Game gameData = new Game();
        
        gameData.setPlayer(playerOne);
        gameData.setSubject(subject);
        gameData.setGameID(UUIDGenerator.generateID());
        
    }
    
    
    
    private static void testFileWriter(Player playerData, Game gameData){
        FileControl fileWriter = new FileControl();
        
        if(playerData.getPlayerID()==null){
            playerData.setPlayerID(getTempID());
        }
        
        fileWriter.writeNewPlayerDataFile(playerData, gameData);
        
    }
    
    private static String getTempID(){
        return UUIDGenerator.generateID();
    }
    
    
    private static Player generateTestPlayer(){
        Player player = new Player();
        
        player.setPlayerID(getTempID());
        player.setName("");
        player.setBestTime(99.99);
        player.setScore(0);
        
        return player;
    }
    
    private static Question generateTestQuestion(){
        Question question = new Question();

        //create an example question object
        //load the example question object
        question.setQuestionID(getTempID());
        question.setQuestionText("");        
        question.setQuestionDifficulty(0);

        //Create a list for holding multiple Answers
        List<Answer> questionAnswers = new ArrayList<>();
        Answer answer1 = generateTestAnswer();
        Answer answer2 = generateTestAnswer();
        //Add the example Answer objects to the list
        questionAnswers.add(answer1);
        questionAnswers.add(answer2);

        //Add the list of example Answers to the Question object's AnswersList attribute
        question.setAnswersList(questionAnswers);

        //Add a single answer for demo-ing
        question.setQuestionAnswer(answer1);
        
        return question;
    }
    
    private static Answer generateTestAnswer(){
        Answer answer = new Answer();
        
        return answer;    
    }
    
    
    private static Subject generateTestSubject(List<Question> questionsList){
        Subject subject = new Subject();

        /*
        subject.setSubjectID(UUIDGenerator.generateID());
        subject.setSubjectName("Basic Math Level 1");
        subject.setSubjectDescription("Basic math level 1 is limited to addition and subtraction");
        subject.setDifficultyLevel(1);
        */
        subject.setQuestionsList(questionsList);

        return subject;    
    }

    public static Player getPlayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

  
    
    
    
    
    

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        CIT_260_Flash_Card_Game.currentGame = currentGame;
    }

  
    public static void setPlayer(Player player) {
        CIT_260_Flash_Card_Game.player = player;
    }
    }