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









    public static void main(String[] args) {
        duplicateCharacterCount("heellloooo");

    }
}