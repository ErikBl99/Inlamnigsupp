public class GuessingGame {

    public static void main(String[] args) {
    
    Guesser Range = new Guesser(0, 1000);
    
 }

   public void start() {
       Range.rules();
       Range.doGuesses();
    // call the rules method here
    // call the doGuesses() method here
  }


  private void rules(){
    System.out.println("Think of a number between " +
                       low + " and "  + high);
    System.out.println("I'm going to ask a few questions in order " +
                       "to guess the number.");
    System.out.println("Please answer T for true, and F for false.\n");
  }

}