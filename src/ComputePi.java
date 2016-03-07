import java.util.Scanner;

public class ComputePi {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //System.out.print("Enter an integer value for i (10000 - 100000): ");
    //double value = input.nextDouble();
    
    for(int j = 10000; j <= 100000; j = j + 10000){
      double pi = 0;  
      for(double i = 1; i <= j; i++){
        pi += (Math.pow(-1, i+1) / (2*i - 1)) * 4;
      }  
        
      System.out.println("Pi at " + j + " is " + pi);
    } // for j 
  }  // main
    
} // ComputePi
