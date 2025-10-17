import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int input1 = 0;
    int sum = 0;
    while (input1 >= 0)
    {
      System.out.println("Type a Number, no negatives, input -1 to add sum of all numbers");
     input1 = scan.nextInt();
      sum = sum + input1;
    }
    sum++;
    System.out.println("Sum is " + sum);
    
    System.out.println("How many numbers do you wish to input?");
    int input2 = 0;
     input2 = scan.nextInt();
         int count = 0;
         int largest_number = 0;
    while (count <= input2)
    {
       System.out.println("Enter a Score");
       input3 = scan.nextInt();
       if (largest_number <= input3)
        {
          largest_number = input3;
        }
        count++;
        }
    }
  }

