package codee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//("abcXY123XYijk", "XY") = "c13i"
public class TestPayU {


    public static void main(String[] args) {
        String str = "XYnckcnvXYvkmdfkgmXYndsjfnXY";
        String std = "abcXY123XYijkmnXYiop";
        String word = "XY";


        StringBuilder newStr = new StringBuilder();

        Map<Integer, Set<Integer>> map = new HashMap<>();
        map.put(1,new HashSet<>());
        map.get(1).add(1);
        map.get(1).add(11);
        map.get(1).add(1);

        System.out.println(map.get(1));



        for (int i = 0; i < str.length(); i++) {


            if (str.charAt(i) == word.charAt(0)) {

                String strTemp = str.substring(i, i + word.length());
                if (strTemp.equals(word)) {
                    if (i > 0)
                        newStr.append(str.charAt(i - 1));
                    if (i < str.length() - 1-word.length())
                        newStr.append(str.charAt(word.length() + i));
                }


            }

        }
        System.out.println(newStr.toString());
    }
}
