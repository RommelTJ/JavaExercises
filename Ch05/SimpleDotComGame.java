import java.util.Scanner;

public class SimpleDotComGame {
    public static void main(String[] args) {
	int numOfGuesses = 0;
	GameHelper helper = new GameHelper();
	//Scanner user_input = new Scanner(System.in);
	SimpleDotCom theDotCom = new SimpleDotCom();
	
	int randomNum = (int)(Math.random() * 5);
	int[] locations = {randomNum, randomNum+1, randomNum+2};
	theDotCom.setLocationCells(locations);
	
	boolean isAlive = true;
	while (isAlive) {
	    String guess = helper.getUserInput("enter a number");	
	    //System.out.println("Enter a number: ");
	    //String input = user_input.nextLine();
	    String result = theDotCom.checkYourself(guess);
	    //if(theDotCom.isValidGuess(guess)){
	    	//result = theDotCom.checkYourself(guess);
		//numOfGuesses++;
	    //}
	    numOfGuesses++;
	    if (result.equals("kill")) {
		isAlive = false;
		System.out.println("You took " + numOfGuesses + " guesses.");
	    }
	}
    }
}
