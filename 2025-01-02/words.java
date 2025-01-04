public class words{

  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters == 0){
    	System.out.println(result);
    }
		else{
			for (int i = 0; i < alphabet.length(); i++){
				makeWords(remainingLetters-1, result+Character.toString(alphabet.charAt(i)), alphabet);
			}
		}
  }

  public static void main(String[] args){
    //System.out.println(args[0]);
    int remainingLetters = Integer.parseInt(args[0]);
    String result = args[1];
    String alphabet = args[2];
    makeWords(remainingLetters, result, alphabet);
  }

}
