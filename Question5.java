import java.util.Scanner;

import java.util.ArrayList;


public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    Scanner in = new Scanner(System.in);
    /*System.out.print("Enter a number: ");*/
    int amount = in.nextInt();
    ArrayList<Integer> data = new ArrayList<>();
    for(int i = 0; i < amount; i++){
      /*System.out.print("Enter a number "+ amount + " times: ");*/
      Integer numbers = in.nextInt();
      data.add(numbers);
    }
    int mode = 0;
    int count = 0;

    for ( int i : data ){
      int data1 = i;
      int temporaryCount = 1;

      for(int e : data){
        int data2 = e;

        if( data1 == data2)
          temporaryCount++;

        if( temporaryCount > count){
          count = temporaryCount;
          mode = data1;
        }
      }
    }

    /*System.out.println("The mode is " + mode);*/

    System.out.println(mode)
  }

}

