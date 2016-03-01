import java.util.Scanner;

public class ComputePi {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer value for i (10000 - 100000): ");
    double value = input.nextDouble();
    double pi = 0;
    
    for(double i = 1; i <= value; i++)
      pi += Math.pow(-1, i+1) / (2*i - 1);
    
    System.out.println("Pi is " + 4*pi);
  }  // main
    
} // ComputePi
