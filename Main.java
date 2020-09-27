import java.util.*;
class Main {
  public static ArrayList<String> missingRanges(int[] intArray, int lower, int upper){
  
  ArrayList<String> missingRanges = new ArrayList<String>();

  for (int i = 0; i <= intArray.length; i++){
    
    if(i == intArray.length){
      lower = intArray[i - 1];
      missingRanges.add((lower + 1) + "->" + (upper));
      
    } else{    
      if (intArray[i] - lower > 1){

      if(intArray[i] - lower == 2){
        missingRanges.add("" + (intArray[i] + 1));
      } else {
        missingRanges.add((lower + 1) + "->" + (intArray[i] - 1));
        lower = intArray[i];
      }

    }
    }

    
  }

    return missingRanges;

}
  public static void main(String[] args) {
    //1. Missing Ranges: Given a sorted integer array where the range of elements are [lower, upper] inclusive, return its missing ranges.

    //    For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, return ["2", "4->49", "51->74", "76->99"].

  int[] intArray = {0, 1, 3, 50, 75};
  ArrayList<String> missingRanges = missingRanges(intArray, 0, 99);
  for(int i = 0;i<missingRanges.size(); i++){
    System.out.println(missingRanges.get(i));
  }


  }
}