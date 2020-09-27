import java.util.*;
class Main {
  //1. Missing Ranges: Given a sorted integer array where the range of elements are [lower, upper] inclusive, return its missing ranges.

       // For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, return ["2", "4->49", "51->74", "76->99"].
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
//2. Binary Search Iterative: Given an array of sorted integers and an integer target, write an iterative program that returns the index of the target if it exists in the array and -1 otherwise.


  public int binarySearch(int arr[], int x) {
    int r = arr.length-1;
    int l = 0;

    while (l <= r) { 
      int m = l + (r - l) / 2; 
      if (arr[m] == x) return m;
      if (arr[m] < x) l = m + 1;
      else r = m - 1;
    }
    return -1;

  } 
  //3. Longest substring: Given a string, write a function that returns the longest substring without repeating characters. 
      //  abcdba -> return abcd or cdba
       // abbcdb -> return bcd or cdb 

  public static void main(String[] args) {

    //1. Missing Ranges: 
  int[] intArray = {0, 1, 3, 50, 75};
  ArrayList<String> missingRanges = missingRanges(intArray, 0, 99);
  for(int i = 0;i<missingRanges.size(); i++){
    System.out.println(missingRanges.get(i));
  }

  //2. Binary Search


  }
}