
package javaapplication1;
import java.util.Scanner;
public class Rami {    
    public Rami(){
        System.out.println("Wellcome to Rami object i will ask you 3 qusions");
        System.out.println("noitce: The latters is sensitive");
        System.out.println("====================================================");
    }
    public void counter1()
    {
       int a = 0;  
       while(a < 4){
          a = a + 1;
          System.out.println(a + " of 3");
           if(a == 1)
               break;
       }
      
    }
    public void counter2()
    {
        int i = 2;
        do
        {
          System.out.println(i  + " of 3 \n");
          i++;
          if(i == 2)
              break;
                
        }
        while(i <= 2);
    }
    public void counter3()
    {
        for(int a = 3;; a++){
            if(a == 4)
                break;
            System.out.println(a  + " of 3 \n");
        }
    }
    
    
    public void Q1()
    {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Q1: how old rami ?" +'\n'+ 
                        "A: 20" +"\n"+
                        "B: 18" +"\n" + 
                        "C: 32" +"\n" + 
                        "D: 12" );
        System.out.print("Please Answer: ");
        String read = input.next();
        switch(read){
            case "A":
                System.out.println("wrong your points is 0 0f 3");
                break;
            case "B":
                System.out.print("Right and your points is " ); counter1();
                break;
            case "C":
                 System.out.println("wrong your points is 0 0f 3");
                 break;
            case "D":
                 System.out.println("wrong your points is 0 0f 3");
                 break;
             default:   
                 System.out.println("wrong your points is 0 0f 3");
                 break;
        }
         System.out.println("====================================================");
    }
    
    public void Q2()
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Q1: who i am ? " +"\n"+
            "A : Java"+"\n"+
            "B: Python"+"\n"+
            "C: C++"+ "\n" +
            "D: JavaScript");
    System.out.print("Please Answer: ");
    String read = input.next();
    if(read.equals("A") || read.equals("Java")){
     System.out.print("Right and your points is "); counter2();
    }else{
        System.out.println("wrong your point is 1 of 3" + "\n" + "Bye");
    }
    System.out.println("====================================================");
    }
    public void Q3()
    {
         Scanner input = new Scanner(System.in);
         System.out.println("Q3: is java like JavaScript ? answer Yes or No ");
         System.out.print("Please Answer: ");
         String read = input.next();
         if(read.equals("No")){
             System.out.print("You Win the game and your points is "); counter3();
         }else if (read.equals("Yes")){
             System.out.println("Game over");
         }else{
             System.out.println("Game over");
         }
    }
    
}
