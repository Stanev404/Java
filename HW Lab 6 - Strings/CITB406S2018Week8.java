<pre><div class="text_to_html">/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citb406s2018week8;

import java.util.Arrays;

/**
 *
 * @author Kostadinova
 */
public class CITB406S2018Week8 {

    // Week 8 Task 1
    public static boolean isPalyndrom(String string) {
        for (int i = 0; i &lt; string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Week 8 Task 2
    public static String firstLettersToUppercase(String string) {
        String newString = &quot;&quot;;
        if (Character.isLetter(string.charAt(0)) || Character.isDigit(string.charAt(0))) {
            newString += string.charAt(0);
        }
        for (int i = 0; i &lt; string.length() - 1; i++) {
            if (string.charAt(i) == &#039; &#039;) {
                if (Character.isLetter(string.charAt(i + 1)) || Character.isDigit(string.charAt(i + 1))) {
                    newString += string.charAt(i + 1);
                }
            }
        }
        return newString.toUpperCase();
    }

    // Week 8 Task 3
    public static String palyndromWords(String string) {
        String newString = &quot;&quot;;

        String[] arrayOfWords = string.split(&quot; &quot;);
        for (String word : arrayOfWords) {
            if (isPalyndrom(word)) {
                newString += word;
            }
        }
        return newString;
    }

    // Week 8 Task 4
    // https://www.geeksforgeeks.org/sort-a-string-in-java-2-different-ways/
    public static String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static boolean isAnagram(String string1, String string2) {
        return sortString(string1).equals(sortString(string2));
    }

    // Week 8 Task 5
    public static String exchangeCharsPlaces(String string) {
        String newString = &quot;&quot;;
        for (int i = string.length() - 1; i &gt;= 0; i--) {
            char currentChar = string.charAt(i);
            if (currentChar == Character.toLowerCase(currentChar)) {
                currentChar = Character.toUpperCase(currentChar);
            } else {
                currentChar = Character.toLowerCase(currentChar);
            }
            newString += currentChar;
        }
        return newString;
    }

    public static void main(String[] args) {
        String s = &quot;four: &quot; + 2 + 2;
        System.out.println(s);

        System.out.println(isPalyndrom(&quot;ioppoi&quot;));
        String string = &quot;This ! IS example.&quot;;
        string = exchangeCharsPlaces(string);
        System.out.println(string);
        string = &quot;Test first letter of each Word?&quot;;
        string = firstLettersToUppercase(string);
        System.out.println(string);
        System.out.println(string);
        string = &quot;This is civic refer or noon&quot;;
        System.out.println(palyndromWords(string));
        String firstString = &quot;sister&quot;;
        String secondString = &quot;resist&quot;;
        System.out.println(isAnagram(firstString, secondString));

    }

}
</div></pre>