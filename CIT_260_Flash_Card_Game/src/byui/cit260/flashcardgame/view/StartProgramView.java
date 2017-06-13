package byui.cit260.flashcardgame.view;

import byui.cit260.flashcardgame.control.GameControl;
import byui.cit260.flashcardgame.model.Player;
import java.util.Scanner;

/**
 * Created by EgbertRG on 5/31/2017.
 * Updated by DiegoFreire on 6/9/2017.
 */
public class StartProgramView {

    public void displayStartProgramView() {
    
        
        
        
        boolean done = false; //set flag to not done
        do{
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(playersName);
        } while(!done);
      
    }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value =""; //value to be returned
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
        
    

    private boolean doAction(String playersName) {
    // If the length of the playersName < 2 then
    // display "Invalid name; The name must be > 1 character"
    // return false
    
    if(playersName.length() < 2) {
       System.out.println("\nInvalid players name:"
       + "The name must be greater than one character in length");
       return false;
    }
        
    
    //call createPlayer() control function
    Player player = GameControl.createPlayer(playersName,playersName);
    
    if(player == null) {//if unsuccessful
        System.out.println("\nError creating the player.");
        return false;
    }
        
    //display next view
    this.displayNextView(player);
    
    return true; //success!
    }
    
    
        
        // promptMessage = "Please enter your name"
        // display the banner when view is created
        
        private String promptMessage;
        
        public StartProgramView() {
        
        this.promptMessage = "\nPlease enter your name:";
        // display the banner when view is created
        this.displayBanner();
        
    }

    public void displayBanner() {
        System.out.println(
       "\n*******************************************"
      +"\n Welcome to the Flash Card Game           *"
      +"\n Prepare to test your knowledge about     *"
      +"\n different subjects and have fun.         *"
      +"\n                                          *"
      +"\n You can select an specific challenge     *"
      +"\n and compete with others, find the        *"
      +"\n missing answers, team up, and learn      *"
      +"\n something new.                           *"
      +"\n*******************************************"
        ); 
    
    
    }

    private void displayNextView(Player player) {
        
        //This displays a custom welcome message
        System.out.println("\n=========================================="
                          +"\n Welcome to the game " + player.getName()
                          +"\n We hope you have a lot of fun!"
                          +"\n=========================================="
                          
                          
                          + "\n-----------------------------------------"
                          + "\n| Main Menu                             |"
                          + "\n-----------------------------------------"
                          + "\nN - Start New Game"
                          + "\nG - Get and start saved game"
                          + "\nH - Get help on how to play the game"
                          + "\nS - Save Game"
                          + "\nQ - Quit"
                          + "\n-----------------------------------------");
         
    //Create the MainMenuView object to be used later
    MainMenuView mainMenuView = new MainMenuView();
            
    //Displays the main menu view
    mainMenuView.displayMainMenuView();        
    
    }
}
