import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public HashMap<String, Integer> calculateRepeatValues(String s) {


        if (s.contains(" ")) s=deletingProbels(s);

        String [] arrayString = s.split("");
        // треба якось викинути пробіли




        HashMap <String, Integer> lettersRepeat = new HashMap<>();


        int count = 0;
        for (int i = 0; i <s.length() ; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (arrayString[i].equals(arrayString[j])) {
                    count++;

                    // що робити з повторами накшталт: bbbbbbbb ?
                    // потрібна колекція з унікальними ключами
                }

            }
//            if (count >=2) lettersRepeat.put(arrayString[i], count);  // якщо лише для повторюваних символів
            lettersRepeat.put(arrayString[i], count);  // для всіх симовлів
            count =0;
        }
        return lettersRepeat;
    }



    private String deletingProbels(String s) {
    //    ArrayList<Integer> numbersProbells  = new ArrayList<>();

//        while(s.contains(" ")){
//
//        }

        StringBuilder str = new StringBuilder(s);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                 str = str.deleteCharAt(i);
            }
        }

        return str.toString();
    }

}
