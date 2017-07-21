/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flashcardgame.view;

import byui.cit260.flashcardgame.control.GameControl;
import cit_260_flash_card_game.CIT_260_Flash_Card_Game;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class MainMenuView {

    private String menu;
    private String promptMessage;

    public MainMenuView() {
       this.menu = "\n"
                 + "\n-----------------------------------------"
                 + "\n| Main Menu                             |"
                 + "\n-----------------------------------------"
                 + "\nN - Start New Game"
                 + "\nG - Get and start saved game"
                 + "\nH - Get help on how to play the game"
                 + "\nS - Save Game"
                 + "\nQ - Quit"
                 + "\n-----------------------------------------";
                       }
    
    
    
    
        
    public void displayMainMenuView() {
        
        
        
        boolean done = false; //set flag to not done
        do{
          //Prompt for and get players name
          String menuOption = this.getMenuOption();
          if (menuOption.toUpperCase().equals("Q")) //User wants to quit
          return; // Exit the game
          
          //Do the requested action and display the next view
          done = this.doAction(menuOption);
        
           } while(!done);
                        
    }

    private String getMenuOption() {
        
        
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while(!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if(value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break; // end the loop
        }
        return value; //return the value entered
    
                       
    }

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();// Convert choice to upper case    }
    
        switch(choice) {
            case "N":// Create and start a new game
               this.startNewGame();
               break;
            case "G":// Get and start an existing game  
               this.displayExistingGame();
               break;
            case "H":// Display the help menu
               this.displayHelpMenu();
               break;
            case "S":// Save the current game
               this.saveGame();
               break;
            default:
               System.out.println("\n*** Invalid selection *** Try Again");
               break;
           
        }
    return false;
    }

    private void startNewGame() {
        //Creates a new game
        
        System.out.println("\n*** startNewGame function called ***");
    
    }

    private void displayExistingGame() {
        System.out.println("\n*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("\n*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }
    
    
    
    }
