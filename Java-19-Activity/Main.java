class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    rollDice();
    lotto();
    diceDistribution(5);
    additionTutor();
    mathQuiz();

    
  }
  /*
  Challenge 1:
  Write a function rollDice() that rolls a die once and returns a value from 1 to 6.
  Example:
  rollDice() ==> "2"
  */
void rollDice(){
          System.out.println((int)(Math.random()*6)+1);
}


  
  /*
  Challenge 2:
  Write a function lotto() that returns a string of 5 numbers from 1 to 48.
  Example:
  lotto() ==> "1 23 34 9 18"
  */
  void lotto(){
    for(int i=0;i<5;i++){
      int num = (int)(Math.random()*48)+1;
      System.out.print(num+", ");
    }
    System.out.println("");
  }
  
  /*
  Challenge 3:
  Write a function diceDistribution() that accepts an integer N and rolls a die N times, keeps a counter of the number of times 1,2,3,4,5,6 was rolled (need a counter for each) and displays the counters for each.
  Test with N values of 100, 1000, 100000, and 1000000.  What do the results look like as the number N gets larger?
  */
    void diceDistribution(int N){
      int count1 = 0;
      int count2 = 0;
      int count3 = 0;
      int count4 = 0;
      int count5 = 0;
      int count6 = 0;
      for(int i=0;i<=N;i++){
        int r = (int)(Math.random()*6-1+1)+1;
        if(r==1){
          count1 ++;
        }else if(r==2){
          count2 ++;
        }else if(r==3){
          count3 ++;
        }else if(r==4){
          count4 ++;
        }else if(r==5){
          count5 ++;
        }else if(r==6){
          count6 ++;
        }
    }
    System.out.println("1: "+ count1+ ", 2: "+ count2+ ", 3: "+count3+ ", 4: "+count4+ ", 5: "+count5+ ", 6: "+count6);
    }

  /*
  Challenge 4:
  Write a function additionTutor() that generates two random numbers and prompts the user to enter the sum of the two numbers. The random integers should range from -20 to 20 (inclusively). If the answer is correct return "Correct!" otherwise return "Incorrect".
  */
    void additionTutor(){
      int num1 = (int)(Math.random()*41)-20;
      int num2 = (int)(Math.random()*41)-20;
      int sum = num1 + num2;
      System.out.println("What is the sum of "+ num1 +" and "+num2 +"?");
      int answer = Input.readInt();
      if(answer==sum){
        System.out.println("Correct!");
      }else{
        System.out.println("Incorrect!");
      }
    }

  /*
  Challenge 5:
  Write a function mathQuiz() that generates a random addition, subtraction, multiplication or division problem of two random integers, prompts the user for the answer. It returns "Correct!" if the answer is correct, otherwise returns "Incorrect". The random integers should range from -20 to 20 (inclusively).
  Hint: For the random operations (+,-,*,/) using a random number from 0 to 3 where 0 means +, 1 means -, 2 means * and 3 means /.
  */
    void mathQuiz(){
      int num3 = (int)(Math.random()*41)-20;
      int num4 = (int)(Math.random()*41)-20;
      int sum = num3 + num4;
      int difference = num3-num4;
      int product = num3*num4;
      double quotient = (num3*(1.0))/(num4*(1.0));
      int answer = 0;
      int operation = (int)(Math.random()*4);
       if(operation==0){
         System.out.println(num3+" + "+num4+" = ?");
         answer = Input.readInt();
         if(answer==sum){
          System.out.println("Correct!");
         }else{
          System.out.println("Incorrect!");
         }
       }else if(operation==1){
       System.out.println(num3+" - "+num4+" = ?");
       answer = Input.readInt();
         if(answer==difference){
          System.out.println("Correct!");
         }else{
          System.out.println("Incorrect!");
         }
        }else if(operation==2){
       System.out.println(num3+" * "+num4+" = ?");
       answer = Input.readInt();
         if(answer==product){
          System.out.println("Correct!");
         }else{
          System.out.println("Incorrect!");
         }
        }else if(operation==3){
       System.out.println(num3+" / "+num4+" = ?");
       answer = Input.readInt();
         if(answer==quotient){
          System.out.println("Correct!");
         }else{
          System.out.println("Incorrect!");
         }
        }
      

}
}
