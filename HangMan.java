
import java.util.*;
public class HangMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player 1, Enter a word: ");
        String word = scanner.next();
        int tries = word.length();
        Boolean Word_guessed = false;

        StringBuilder guess = new StringBuilder("_".repeat(word.length())); 

        System.out.println(guess);

        while (tries > 0 && !Word_guessed){
            System.out.println("Enter a letter: ");
            Character letter = scanner.next().charAt(0);

            boolean found = false;
            for(int i=0; i<word.length(); i++){
                if(word.charAt(i) == letter){
                    guess.setCharAt(i, letter);
                    found = true; 
                }
            }
            if(!found){
                tries--;
                System.out.println(tries + " Tries left");
            }
            else{
                System.out.println("Good guess");
            }
            System.out.println("Word: " + guess);

            if (guess.toString().equals(word)){
                Word_guessed = true;
            }
        }
        if (Word_guessed){
            System.out.println("Congragulations you guessed the word: " + word);
        }
        else{
            System.out.println("You lost... The word was: " + word);
        }
        scanner.close();

}
}
