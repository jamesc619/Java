class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    // 1: Emoji
      String[] emojis = {"1F913", "1F62D", "1F5E3", "1F940"};
      for(int i=0; i<=emojis.length-1; i++){
        printt(convertToEmoji(emojis[i]));
      }
      System.out.println("");

    // 2: Total including tax
      double[] prices = {2.99, 4.49, 1.99, 6.7, 1};
      print(totalWithTax(prices));

    // 3: Integer Present ?
      int[] ints = {1,2,3,4,5,6,7};
      print(isPresent(ints, 6));

    // 4: Lotto
      int[] picks = {1,2,3,4,5,6};
      int[] drawn = {1, 2,5,7,9,6};
      print(checkLotto(picks, drawn));

    // 5: Largest integer in array
      int[] integers = {1,5,2,16,232,6,23,53,32724,2147483647};
      print(biggest(integers));
    
    // 6: First N prime #s
      primeList(67);
  }

    /* 1:  Create an array of emojis and then display each emoji.  When printing, use the fn convertToEmoji() provided below to display the actual emoji.

  Look at "Lesson 21 CW_1_Solution": the rollDice() fn is an example of using unicodes as cards.
  Resource for unicodes: 
  https://unicode.org/emoji/charts/emoji-list.html
    */  
  String convertToEmoji(String code){
    return String.valueOf(Character.toChars( Integer.parseInt(code, 16) ));
  }


    /* 2:  Write a fn totalWithTax() that accepts an array of prices and returns the sum of the prices plus tax. Use the 2023 NYC sales tax rate of 8.875%.
  To test the function, create an array of prices in the init function.
    */ 
      double totalWithTax(double[] prices){
        double total = 0;
        double total_ = 0;
                for(int i=0; i<=prices.length-1; i++){
                    total += prices[i]*1.0875;
      }
      total_ = Math.round(total*100.0)/100.0;
      return total_;
      }


    /* 3:  Create a fn isPresent() that accepts an array of integers and one integer number. Return true if the number is in the array; otherwise return false.
  To test the fn, create an array of integers.
    */ 
  boolean isPresent(int[] ints, int find){
	  for(int i=0; i<=ints.length-1; i++){
      if(ints[i]==find){
        return true;
      }
    }
    return false;
  }


    /* 4:  Create a fn checkLotto() that accepts an array representing 6 lotto number picks and an array representing 6 lotto numbers drawn. It returns how many winning number picks were present among the lotto numbers drawn. 
  HINT: make use of the function isPresent() from problem 3.

  To test the function, create an array representing your lotto number picks and another array representing the lotto numbers drawn
    */ 

    int checkLotto(int[] picks, int[] drawn){
      int count = 0;
      for(int i=0; i<6; i++){
        if(picks[i]==drawn[i]){
          count ++;
        }
      }
      return count;
    }
  // 5: Write a fn biggest() that accepts an array of integers and returns the largest value in the array.

  int biggest(int[] ints){
    int max = 0;
    for(int i=0; i<=ints.length-1; i++){
      if(ints[i]>max){
        max = ints[i];
      }
    }
    return max;
  }
  
    /* 6:  Write a fn primeList() that takes in an integer N and returns the first N prime numbers. Use the function isPrime() provided to you.
    */ 
   void primeList(int N){
    int count = 0;
    int num = 2;
    while(count < N){
      if(isPrime(num)){
        printt(num+ ", ");
        count ++;
      }
      num ++;
    }
   }
    

  

  // fn to generate random integer
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) +lower;
  }
  
  // fn to determine prime # or not
  boolean isPrime(int n){
    int divisor = 2;
    while(n%divisor !=0){
      divisor+=1;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }
  
}