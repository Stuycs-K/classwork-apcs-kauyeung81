public class Backtracking{

  /*
  *@param length how long the words must be
  *param word the variable to store the partial solution (Initial call should start at "")
  *param letters will contain the unique* letters allowed in the string.
  *      (*unique: You can assume there are no duplicates)
  *@return the number of words that have no adjacent matching letters
  *        using the letters provided. This is possibly zero if there
  *        is only one unique letter provided, but that is an edge case.
  *Repetition allowed except when letters are adjacent e.g. "abababa" is allowed.
  */
  public static long countNoDoubleLetterWords(int length,String word, String letters){
  //Hint: not a wrapper method, but you must call it starting with "" as your word
  // e.g. countNoDoubleLetterWords(5,"","abc")
	if (length == 0){
		return 1;
  }
	int count = 0;
	for (int i = 0; i < letters.length(); i++){
		char added = letters.charAt(i);
		if (word.equals("") || word.charAt(word.length() -1) != added){
			count += countNoDoubleLetterWords(length-1, word + added, letters);
		}
	}
	return count;
}

  public static boolean groupSum(int start, int[] nums, int target) {
		if (start >= nums.length){
			return target == 0;
		}
    return groupSum(start+1, nums, target - nums[start]) || groupSum(start+1, nums, target);
  }
	
	public static void main(String args[]){
		System.out.println(groupSum(0, new int[]{2, 4, 8}, 10));
		System.out.println(groupSum(0, new int[]{2, 4, 8}, 14));
		System.out.println(groupSum(0, new int[]{2, 4, 8}, 9));
		
		System.out.println(countNoDoubleLetterWords(5,"","abc"));
		System.out.println(countNoDoubleLetterWords(2,"","a"));
		System.out.println(countNoDoubleLetterWords(2,"","ab"));
		System.out.println(countNoDoubleLetterWords(3,"","ab"));
	}

}
