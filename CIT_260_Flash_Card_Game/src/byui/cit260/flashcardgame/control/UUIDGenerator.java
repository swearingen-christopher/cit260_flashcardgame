/*
 * This class will generate the Universally Unique IDentifier values (UUID) 
 * that we will use for the various ID fields within our classes
 */
package byui.cit260.flashcardgame.control;
import java.util.UUID;

/**
 *
 * @author christopher.swearing
 * @see https://docs.oracle.com/javase/8/docs/api/java/util/UUID.html
 */
public class UUIDGenerator {
  
  public static final String generateID(){
    //generate random UUIDs
    return UUID.randomUUID().toString();
  }
    
}
