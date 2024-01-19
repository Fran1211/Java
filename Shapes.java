package Shapes_ch4;
import java.util.Scanner;

public class Shapes 
{
   //*********//
   //Main Menu//
   //*********//
   public static void main (String[] args)
   {
       
        System.out.println("Please select a shape to be drawn");    //Asks user for input 
        System.out.println("1.Square");                             //Option 1 
        System.out.println("2.X Pattern");                          //Option 2 
        System.out.println("3.Diamond");                            //Option 3
        
        Scanner menu = new Scanner(System.in);                      //Scanner for taking user input
        int choice = menu.nextInt();                                //Stores user input in variable "choice"
        
        if(choice == 1)                                             //Calls square method if user choose 1
        {
          square();
        }
        else if(choice == 2)                                             //Calls X method if user chooses 2
        {
          x();
        }
        else if(choice == 3)                                             //Calls diamond method if user chooses 3
        {
          diamond();
        }
        else
        {
            System.out.println("Invalid Input");
        }
     
   }
   //*************//
   //Square method//
   //*************//
   public static void square()
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input number of rows and columns:\n");
      int size = sc.nextInt();                                      //Scanner to take user input for number of rows/columns
      
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                System.out.print("* ");
            }
         System.out.println("");
        }
   }
   //********//
   //X method//
   //********//
   public static void x()
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Input number of rows and columns:\n");
       int size = sc.nextInt();                                      //Scanner to take user input for number of rows/columns
       
        for(int i = 1; i <= size; i++)
        {
            for(int j = 1; j <= size; j++)
            {
                if(i == j || i + j == size + 1)
                    System.out.print("* ");
                
               else
                    System.out.print(" ");
            }
            System.out.println();
        }
   }
   //**************//
   //Diamond method//
   //**************//
   public static void diamond()
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Input number of rows and columns:\n");
       int size = sc.nextInt();                                       //Scanner to take user input for number of rows/columns
       
        for(int i = 0; i <= size; i++)
        {
            for(int j = 1; j <= size - i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = size - 1; i >= 1; i--)
        {
            for(int j = 1; j<= size - i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
   }
} 


