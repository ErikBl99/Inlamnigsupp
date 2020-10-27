import java.io.Console;
import java.io.InputStream;
import java.util.Scanner;


public class Guesser{
  
  // defining the two variables
  public int low; 
  public int high;


  Guesser(int low, int high){
    this.low = low;
    this.high = high;
  }

  //creates the rules and the guesses
  public void start(){
    rules();
    doGuesses();
  }

  //start the program
  private void rules(){
    System.out.println("Tänk på ett nummer mellan " +
                       low + " & "  + high);
    System.out.println("Jag kommer att ställa ett par frågor för att " +
                       "gissa vilket nummer du tänker på.");
    System.out.println("Var snäll att svara T för sant, & F för falskt.\n");
  }

  //defines what happens when you type the wrong input
  private String getReply(){
    String reply = new Scanner(System.in).nextLine();

    while (!reply.equals("T") && !reply.equals("F")) {
    System.out.println("Var snäll och svara T eller F");    
    reply = new Scanner(System.in).nextLine();

    }
     return reply;
  }

  private String scanner(InputStream in) {
	return null;
}

private void doGuesses(){
    int i=0; // number of guesses
    int middle=0;
    while(low<high){
      // Set next guess to the middle between
      // current low and current high
      middle=low + (high-low)/2;

      System.out.println("Är numret mindre eller lika med " +
                         middle + "?");
      String reply = getReply();
      if("T".equals(reply)){
        // The number is less than or equal to middle
        // so we move down high to middle
        high = middle;
      }else{
        // The number is greater than middle,
        // so we move up low to middle + 1
        low = middle + 1;
      }
      i++; // One more guess!
    }
    // When low has met high, we don't enter the loop
    // and we have found the number
    answer(low, i);
  }

  private void answer(int guess, int numberOfGuesses){
    System.out.println("Du tänkte på " +
                       guess +
                       " (Det tog mig " + numberOfGuesses +
                       " gissningar)");
  }

}