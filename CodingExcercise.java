import java.util.*;

public class CodingExcercise {

/*
* Iterates through a generic list of integers. Returns a map that describes number of integers
* above the compareValue integer and below the compareValue integer.
*
* @param List<Integer> unsortedList - an unsorted list of integers
* @param int compareValue - an integer that will be compared to integers in unsortedList
 */
public static Map<String, Integer> aboveBelow(List<Integer> unsortedList, int compareValue) {
     Map<String, Integer> valueDistribution = new HashMap<String, Integer>();
     valueDistribution.put("above", 0);
     valueDistribution.put("below", 0);

     for(int i: unsortedList) {
         if(i > compareValue)
             valueDistribution.put("above", valueDistribution.get("above") + 1);
         if(i < compareValue)
             valueDistribution.put("below", valueDistribution.get("below") + 1);
     }


     return valueDistribution;

    }


    /*
     * Iterates through input string and uses StringBuilder object to create new string that is rotated.
     *
     *
     * @param String input - the string to rotated
     * @param int rotationAmount - the amount to shift each character in the input string
     */
    public static String stringRotation(String input, int rotationAmount) {

    StringBuilder result = new StringBuilder(input);
    for(int i = 0; i < input.length(); i++) {

        int offSet = i + rotationAmount;    // get index of character's new location in rotated string

        if(offSet >= input.length())        // calculate where character would wrap around if the offSet index is greater the end of the string's index
         offSet = offSet % input.length();

        result.setCharAt(offSet, input.charAt(i));
    }


    return result.toString();
}
}
