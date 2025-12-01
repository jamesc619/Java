class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    print(toUpper("hello"));
    print(pswdGenerator());
    }
  /*
  Problem 1:
  Write a fn toUpper() that accepts a string and converts all lower case letters to upper case and returns the result.
  */
    // String toUpper(String msg){
    //   String build = "";
    //   for(int x=0; x<msg.length(); x++){
    //     char ch = msg.charAt(x);
    //     int pos = (int)ch;
    //     ch = (char)(ch - ('a' - 'A'));  //add the ascii value
    //     build += ch;
    //   }
    //   return build;
    // }
      String toUpper(String msg){
        String build = "";
        for(int i=0;i<=msg.length()-1;i++){
          char ch = msg.charAt(i);
          int upPos = (int)ch+32;
          char chUp = (char)upPos;
          build += chUp;
        }
        return build;
      }

  /*
  Problem 2:
  Write a fn pswdGenerator() that generates and returns a 9-character password.
*/
    String pswdGenerator(){
    String build = "";
    for(int x=1; x<=9; x++){
      int ascii = randInt(33,126);
      build += (char)ascii;
    }
    return build;    

  }
    


  

  //fn to generate random integer
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  } 

 
}