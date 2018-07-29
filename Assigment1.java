/*
* CS55_ZacharyDavis_Project 1 
* Calculating future investment rate. 
 */

public class Assigment1 {
    
    public static void main(String[] args){
    
       int investmentAmount = 1000;
       double monthlyInterestRate = 0.0325;
       int numberOfYears = 5;
       
       double MR = (1 + monthlyInterestRate);
       int years = (numberOfYears * 12);
       double expo = Math.pow(MR,years);
       double finalCost = (investmentAmount * expo);
       
      
       
       System.out.println("Your total cost is $" + (int)(finalCost * 100) / 100.0 + " for " + numberOfYears + " year(s).");
       
       
     
    }
    
}
