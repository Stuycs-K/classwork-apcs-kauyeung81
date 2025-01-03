public class words{

  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters > 0){
      for (int i = 0; i < alphabet.length(); i++){
        String letter = alphabet.charAt(i);
        result = result + letter;
        System.out.println(result);
      }
      return makeWords(remainingLetters-1, result, alphabet);
    }
    else{
      System.out.println(result);
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
