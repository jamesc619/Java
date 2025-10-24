class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
  // Call the functions with appropriate arguments
    range(1);
    System.out.println(compound(1000,5,3));
  }
  
  /*
    1) 
    Write a function range() that accepts a start value, end value and incremental step to display all the integers from the start to end values (inclusive). 
    For example start=1, end=7, step=2 function displays 1 3 5 7
  */
      void range(int start){
        for (int i=start;i<=7;i+=2){
          print(i);
        }
      }

   /* 
    2) Compound Interest
    Write a function compound() that accepts an investment amount, annual interest rate and the # of years of investment. Display how the investment grows per year.
    For example: 
    Investment $1,000, interest rate 5% and term 3 years:
    Year 1: 1070.00
    Year 2: 1144.90
    Year 3: 1225.04
  */
    double compound(double initial, double rate, int years){
      double amount=initial;
      for (int i=1;i<=years;i++){
        amount = amount * (1 + rate/100);
      }
      return amount;
    }
}