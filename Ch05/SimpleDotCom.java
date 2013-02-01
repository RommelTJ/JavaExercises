public class SimpleDotCom {
    int[] locationCells;
    int numOfHits;
    //String[] guesses = new String[100];
    //guesses[0] = "";

    public void setLocationCells(int[] locs) {
	locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
	int guess = Integer.parseInt(stringGuess);
	String result = "miss";
	for (int cell:locationCells) {
	    if (cell==guess) {
		result = "hit";
		numOfHits++;
		break;
	    }
	}
	if (numOfHits == locationCells.length) {
	    result = "kill";
	}
	System.out.println(result);
	return result;
    }

    //public boolean isValidGuess(String stringGuess) {
	//int guess = Integer.parseInt(stringGuess);
	//if (guesses.length==0){
	//    guesses[0] = guess;
	//    return true;
        //}
	//int append = guesses.length;
	//System.out.println(append);
	//if (append==0){
	//    guesses[0]=stringGuess;
	//    return true;
        //}
	//else {
	//    guesses[append] = stringGuess;
	//}
	//for (String i:guesses) {
	//    if (i.equals(stringGuess)){
	//	return false;
	//    }
	//}
	//return true;
    //}
}

