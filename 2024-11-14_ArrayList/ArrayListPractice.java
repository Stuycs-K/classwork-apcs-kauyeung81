import java.util.ArrayList;

public class ArrayListPractice{
	public static ArrayList<String> createRandomArray(int size){
		ArrayList<String> arr = new ArrayList<String>(size);
    for(int i = 0; i < size; i++) {
      String temp = "";
      int tempInt = (int)(11 * Math.random());
      if(tempInt != 0) {
        temp+=tempInt;
      }
      arr.add(temp);
    }
    return arr;
  }

  public static void replaceEmpty(ArrayList<String> original){
    for(int i = 0; i < original.size(); i++){
      if(original.get(i).equals("")){
        original.set(i, "Empty");
      }
    }
  }

  public static ArrayList<String> makeReversedList(ArrayList<String> original){
    ArrayList<String> result = new ArrayList<String>(original.size());
    for (int i = original.size()-1; i > -1; i--){
      result.add(original.get(i));
    }
    return result;
  }

  public static ArrayList<String> mixLists(ArrayList<String> a, ArrayList<String> b){
    ArrayList<String> result = new ArrayList<String>(a.size() + b.size());
		int aSize = a.size();
		int bSize = b.size();
		int i = 0;
    while(aSize > 0 && bSize > 0){
			result.add(a.get(i));
			result.add(b.get(i));
			aSize--;
			bSize--;
			i++;
    }
		while (aSize > 0){
			result.add(a.get(i));
			aSize--;
			i++;
		}
		while (bSize > 0){
			result.add(b.get(i));
			bSize--;
			i++;
		}
		return result;
  }
	
	
	
}