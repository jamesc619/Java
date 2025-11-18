class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    // allowance1();
    // allowance2();
    // addTwoNumbers();
    // securityCode("Geometry Dash");
    menu();
    
  }
/* Challenge 1:  Allowance Plan A or B ?
  Plan A: You get $5 on day 1 and no more. 
  Plan B: You get a penny on day 1. On each following day thereafter, you double the value from the previous day. 
  How many days will it take for the amount in plan B to equal or exceed that of plan A?
  Write a function allowance1() that solves the problem.
*/
   void allowance1(){
    int day = 1;
    double planA = 5.0;
    double planB = 0.01;
    
    while(planB < planA){
      day++;
      planB *= 2;
    }
    print("It will take " + day + " days for Plan B to exceed or equal Plan A.");
   }

/* Challenge 2:  Allowance Plan 1 or 2 ?  
  Plan-1 : Start with $1000. Add $100 each day to the previous day's balance.
  Plan-2 : Start with 1 penny. Add double that the next day. For each day after that, the amount added the previous day is doubled and added to the balance.

  Write a function allowance2() that will display the daily value in each plan as you determine how many days it will take for Plan2 to be better than Plan1.
*/
   void allowance2(){
    int days = 1;
    double plan1 = 1000;
    double plan2 = 0.01;
    
    while(plan2 < plan1){
      days++;
      plan1 += 100;
      plan2 *= 2;
      print("Plan B: "+plan2);
      print("Plan A: "+plan1);
      
    }
      print("days taken for plan b to exceed plan a: " + days);
   }
  

  
/*
    Challenge 3:
    Write a function addTwoNumbers() that generates two random integers (between -10 and 10), and then asks the user to enter the sum of those two numbers. Allow the user to keep trying until they get it correct.
*/
  void addTwoNumbers(){
    int num1 = (int)(Math.random()*21)-10;
    int num2 = (int)(Math.random()*21)-10;
    int guess = 0;
    int sum = num1+num2;
    print("What is the sum of "+ num1 +" and " + num2+"?");
    guess = Input.readInt();
    while(guess != sum){
      print("Wrong Guess. Try again");
      guess = Input.readInt();
    }
    if(guess==sum){
      print("Correct!");
    }
    
  }

/*
    Challenge 4:
    Write a function GCF() that accepts two integers, calculates and returns the GCF (greatest common factor) of the two integers. (For e.g, GCF of 12 and 18 is 6.)
*/
  void GCF(int a, int b){
    int gcf = 1;
    for(int i=1; i<=Math.min(a,b); i++){
      if(a%i==0 && b%i==0){
        gcf = i;
      }
    }
    print("The GCF of "+a+" and "+b+" is: "+gcf);
  }

/*
    Challenge 5:
    Write a function securityCode() that receives a security code. Ask the user to enter their code. Check to see if the user's entry matches the security code. If it does, display "Access granted!". If not, keep asking for the code.
*/

  void securityCode(String code){
    String entry = "";
    while(!entry.equals(code)){
      print("Enter the security code:");
      entry = Input.readString();
      print("Incorrect. Enter code");
    }
    print("Access granted!");
  }

/*
    Challenge 6:
    Write a function menu() that allows a user to choose 1 of 5 functions present above. Also include a 6th choice to exit out of the menu.
    Example:
    Menu: make your choice
    1 - Allowance plan A or B ?
    2 - Allowance plan 1 or 2 ?
    3 - Addition game
    4 - GCF of two integers
    5 - Security Code
    6 - Exit Menu
*/
  void menu(){
    int choice = 0;
    while(choice !=6){
      print("Choose your option: \n1 - Allowance plan A or B ? \n2 - Allowance plan 1 or 2 ? \n3 - Addition game \n4 - GCF of two integers \n5 - Security Code \n6 - Exit Menu");
      choice = Input.readInt();
      if(choice == 1){
        allowance1();
      }else if(choice == 2){
        allowance2();
      }else if(choice == 3){
        addTwoNumbers();
      }else if(choice == 4){
        print("Enter two integers:");
        int a = Input.readInt();
        int b = Input.readInt();
        GCF(a, b);
      }else if(choice == 5){
        securityCode("Geometry Dash");
      }else if(choice == 6){
        print("Exiting menu.");
    }
  }
  }
  
  int randInt(int lower, int upper){
    int range = upper - lower +1 ;
    return (int)(Math.random()*range) +lower;
  }

}