package codee;

import java.util.ArrayList;
import java.util.List;

public class PairSum {
    //Write a Programm to find if a given number can be found by add two numbers in a List

   // List: {1,9,11,17,2,6,13} Number : 28 Output : true
   // List : {1,2,3,4} Number : 6 output: true
   // List : {1,2,3,4} Number : 13 output : false44

    public static boolean check(List<Integer> myList, int number)
    {
        for(int i : myList)
        {
            if(myList.contains(number-i) && i*2!=number)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(7);

        int number = 14;

        boolean ans = check(myList,number);
        System.out.println("Answer is "+ans);



    }
}
