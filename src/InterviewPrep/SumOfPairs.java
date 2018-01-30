package InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class SumOfPairs {

    public static void main (String args[])
    {
        double num = 7;

        Number[] arr = { 2, 1, 9, 5, 3, 6 };

        Map<Double, Number> pairs = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            if(pairs.containsValue(arr[i])){

                System.out.println("check");
                System.out.println(arr[i]+", "+pairs.get(arr[i]));
            }else{

                pairs.put(num - arr[i].doubleValue(), arr[i]);
            }
        }





        int[] numArr = { 2, 1, 9, 5, 3, 6 };
        for (int i = 0; i <= numArr.length - 1; i++) {
            for (int j = i + 1; j <= numArr.length - 1; j++) {
                if ((numArr[i] + numArr[j]) == num) {
                    System.out.print("[(" + numArr[i] + "," + numArr[j] + ")]");
                }
            }
        }

        System.out.println();



        Number[] numArr2 = { 2, 1, 9, 5, 3, 6 };
        int start=0 ;
        int end=numArr2.length-1;
        while (start < end)
        {
            double num1 = numArr2[start].doubleValue();
            double num2 = numArr2[end].doubleValue();
            System.out.println("Pairs before addition:" + num1 + "," +num2);

            if(num1 + num2 == num) {
                System.out.println(numArr2[start] + "" +numArr2[end]);
                start++;
                end--;
            }
            else if(num1 + num2  < num)  start++;

            else if(num1 + num2  > num)  end--;
        }
    }
}
