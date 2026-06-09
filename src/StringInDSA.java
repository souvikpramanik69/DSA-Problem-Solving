import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StringInDSA {

    // Reverse a String
    public static String reverseString(String value){
        String reverse = "";
        for (int i = value.length()-1; i  >= 0 ; i--) {
        reverse += value.charAt(i);
        }
        return  reverse;
    }

    // Palindrome String
    public static Boolean isPalindromeString(String value){
        String reverse = reverseString(value);
        if(value.equals(reverse)){
          return true;
        }
        return false;
    }

    // Anagram Check in String
    public static Boolean isAnagramString(String value1,String value2){
       if(value1.length() != value2.length()){
           return false;
       }
       char[] char1 = value1.toCharArray();
       char[] char2 = value2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);
       return Arrays.equals(char1,char2);
    }

    //Duplicate Character Count in String
    public static void duplicateCharacterCount(String value){
        Map<Character,Integer> map = new HashMap<>();
        // here putting value inside map key as character and value as occurrence i mean if charatcer is present the just increame the value
        for(char ch : value.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1); // this line incrementing the value  map.getOrDefault(ch,0) + 1
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("Ch - >  "+entry.getKey()+" , count - > en" +  " "+entry.getValue()+"  "  );
            }
        }

    }


    public static void duplicateCharacterFound(String value){

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < value.length() ; i++) {
            map.put(value.charAt(i),map.getOrDefault(value.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("Character "+entry.getKey()+" - > "+entry.getValue()+" ");
            }
        }
    }

    public static void duplicateArrayElementFound(int [] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey()+" - > "+ entry.getValue());
            }
        }
    }

    public static void missingNumberIsInAnArray(int [] arr){
          int n = arr[arr.length-1];
          int expectedSum = n * (n+1)/2;
          int actualSum = 0;
          for(int num : arr){
              actualSum+=num;
          }
          int num =  expectedSum - actualSum;
        System.out.println("Missing number in an array is " + num);
    }

    public static void twoSumProblem(int [] arr,int target,String approach){
        switch (approach){
            case"approach1":{
                for(int i = 0; i < arr.length; i++){
                    for(int j = i +1; j < arr.length; j++){
                        if((arr[i]+arr[j]) == target){
                            System.out.println( "Done by On2 approach ===> " +i+" "+ j);
                        }
                    }
                }
                break;
            }
            case"approach2":{
                Map<Integer,Integer> map = new HashMap<>();
                for(int i = 0; i < arr.length; i++){
                  int complement = target - arr[i];
                  if(map.containsKey(complement)){
                      System.out.println( "Done by On approach ===> " +map.get(i)+" "+ i);
                  }
                  map.put(arr[i],i);
                }
                break;
            }
            default:{
                System.out.println("Approach not available");
            }
        }
    }

    public static void nonRepeatingElement(String value){
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0; i < value.length(); i++){
            map.put(value.charAt(i),map.getOrDefault(value.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }

    // Move all zeros to end while maintaining order of non-zero elements
    public static int [] moveAllZeoToEnd(int [] arr){
        int index = 0;
        for(int num : arr){
          if(num != 0){
              arr[index++] = num;

          }
        }
        while(index < arr.length){
            arr[index++] = 0;
        }
        return arr;
    }

    // Move all zeros to first while maintaining order of non-zero elements || Bubble Sort
    public static int [] moveAllZeoToFirst(int [] arr) {
      int temp = 0;
      for(int i = 0 ; i < arr.length; i++){
        for(int j = i+1; j < arr.length; j++){
            if(arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
      }
        return arr;
    }

    // Valid Parentheses
    public static boolean isValidParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '{' || ch == '(' || ch == '['){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(( ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')){
                  return false;
                }
            }
        }
        return stack.isEmpty();


    }

    // Palindrom number check
    public static boolean isPalindromeNumber(int number){
        int rem;
        int temp = number;
        int rev=0;
        while(number > 0){
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number /10;
        }
        if(temp != rev){
            return false;
        }
     return true;

    }

    public static boolean isSunnyNumber(int number){
           int fixedNumber = number + 1;
           double squareRoot = Math.sqrt(fixedNumber);
        if((squareRoot * squareRoot) ==  fixedNumber){
            return true;
        }
       return false;
    }





    public static void main(String[] args) {

//        int [] arr = {8,1,4,0,3,0,5};
//   int [] newArr = moveAllZeoToFirst(arr);
//        for(int i = 0; i<newArr.length; i++){
//            System.out.println(newArr[i]);
//        }

        String str = "{[()]}";
//        System.out.println(isValidParentheses(str));;
        System.out.println(isPalindromeNumber(191));
        System.out.println(isSunnyNumber(48));

    }
}
