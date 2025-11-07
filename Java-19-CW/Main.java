class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    addNums();
    generatePIN();
  }
  /*
  Problem 1:
  Write a function addNums() that returns a string displaying the addition of two random integers that range from -50 to 50 inclusively. 
  Example:
  addNums()==> "-23 + 10 = ?"
  addNums()==> "17 + 41 = ?"
  */
    void addNums(){
      int num1 = (int)(Math.random()*101)-50;
      int num2 = (int)(Math.random()*101)-50;
      int sum = num1 + num2;
      System.out.println("What is the sum of "+ num1 +" and "+num2 +"?");
    }

  /*
  Problem 2:
  Write a function generatePIN() that generates a random PIN, with each digit being from 3 to 8.
  Example:
  generatePin() ==> 4547
  generatePin() ==> 8365
  */
    void generatePIN(){
      int num3 = (int)(Math.random()*6)+3;
      int num4 = (int)(Math.random()*6)+3;
      int num5 = (int)(Math.random()*6)+3;
      int num6 = (int)(Math.random()*6)+3;
      print(num3+""+num4+""+num5+""+num6);
    }
  
}