class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    System.out.println(groupSavings(6));
    System.out.println(groceryDiscount(167,5));
        
  }

  /*
    Problem 1:      
    Write a function groupSavings() that takes the number of tickets you want 
    to purchase. Return the total cost by applying the following prices:
    1 to 8 tickets  : each ticket costs $11.00
    9 to 16 tickets : each ticket costs $10.50
    over 16 tickts  : each ticket costs $8.50
  */
  double groupSavings(int tickets){
    if(tickets>0 && tickets<9)
      return 11;
    else if(tickets>8 && tickets<17)
      return 10.5;
    else if(tickets>16)
      return 8;
    else 
      return 0;
  }
  
  /*
    Problem 2:
    Write a function groceryDiscount() that takes the total amount spent at 
    a grocery store and the number of cans purchased. Based on the total amount 
    and the number of cans purchased, you get a savings on your total bill.
    
    Return the amount saved:
      Spend $100 to $200 and purchase at least 3 cans: $10 savings
      Spend over $200 and purchase more than 4 cans: $25 savings
      Otherwise: No discount.
    */
   double groceryDiscount(double spend, double cans){
    if(spend>99&&spend<200&&cans>2)
      return 10;
    else if(spend>199&&cans>3)
      return 25;
    else
      return 0;
    
   }

  boolean tooSmall(double radius){
    double A = (Math.PI*Math.pow(radius,2));
    if(A<47){
      return true;
    }else{
      return false;
    }
  }
}