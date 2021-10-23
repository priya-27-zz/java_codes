package gfg;

import java.util.Arrays;

public class sortString {


    String sort(String s) {
        // code here
        char[] str = s.toCharArray();
        Arrays.sort(str);
        String ans = "";

        for (int i = 0; i < str.length; i++) {
            ans = ans + str[i];
        }
        return ans;
    }


    public static void main(String[] args) {


        sortString sr = new sortString();
        System.out.println(sr.sort("edcab"));
    }
}
