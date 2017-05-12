/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit_260_flash_card_game;

import byui.cit260.flashcardgame.model.Answer;
import byui.cit260.flashcardgame.model.Player;
import byui.cit260.flashcardgame.model.Question;

/**
 *
 * @author jsmoo
 */
public class CIT_260_Flash_Card_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player();
        
        playerOne.setName("Austin Powers");
        playerOne.setBestTime(10.00);
        playerOne.setPlayerID("Player 1");
        playerOne.setScore(100);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Question question1 = new Question();
        
        question1.setQuestionID("Question1");
        question1.setQuestionText("What is the answer to life, the universe, and everything?");
        
        Answer answer1 = new Answer();
        answer1.setAnswerText("42");
        answer1.setAnswerCorrect(true);
        
        question1.setQuestionAnswer(answer1);
        
        System.out.println(question1);
        
        
    }
    
}
