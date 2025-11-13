class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    eggs();
    intersect();
  }
  /* Problem 1: Eggs
    After a farmer disastrously breaks and loses count of her eggs, she experiences difficulty recalling her original quantity. When questioned about the incident, she is able to remember that her eggs could not be evenly divided into twos, threes, fours, fives, or sixes without having a single egg left over each time. The only number by which the quantity could be evenly divided into was seven. How many eggs did she have originally?
    Write a function eggs() that returns the quantity of eggs she originally had.
  */
    void eggs() {
      int eggs = 0;
      while (!(eggs % 2 == 1 && eggs % 3 == 1 && eggs % 4 == 1 && eggs % 5 == 1 && eggs % 6 == 1 && eggs % 7 == 0)){
          eggs++;
        }
        System.out.println("Eggs: " + eggs);
      }



    /* Problem 2:
  Write a function intersect() that returns the value of x where two linear equations intersect.  Equations are:  y=x+3  and  y=12-2x.
  (Given: x>0 and x is a whole number)
    */
   void intersect(){
    int y=3;
    int x=0;
    while(!(12-2*x==y)){
      x++;
      y++;
    }
    System.out.println("x is: " + x);
   }
// you have to make the y and x go up like its a function lol( you are making the loop act like a mathematical function)
  
}