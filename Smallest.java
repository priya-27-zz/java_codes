package codee;

public class Smallest {

    //Write a Programm to Print next Smallest Element in the List


   // Input :{1,3,1,5,4,2}
   // Output : {-1,1,-1,2,2,-1}


    public static void main(String[] args) {

        int[] arr = {1, -2, 1};
        int[] outArr = new int[arr.length];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            min=Integer.MAX_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                min = Math.min(min, arr[j]);
            }
            if (min < arr[i])
                outArr[i] = min;
            else
                outArr[i] = -1;
        }


        for (int i = 0; i < arr.length;i++)
        {
            System.out.print(outArr[i]+" ");
        }

    }

}
