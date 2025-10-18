class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // Invoke the functions below
    System.out.println(getUsername("jamesc619@nycstudents.net"));
    System.out.println(splitReverse("racecars"));
    System.out.println(createUsername("james", "choy", "100966241"));
    
  }
  /*
    Problem 1:
    Write a function getUsername() that accepts an email and returns the user name. Example: joexyz@gmail.com ==> joexyz
  */
    String getUsername(String email){
      int atlocation = email.indexOf("@");
      String user = email.substring(0, atlocation);
      return user;
   }

  /*
      
    Problem 2:
    Write a function splitReverse() that accepts a string and returns a new string made up of the second half followed by the first half of the original string.  Example: "Happy Days" ==> " DaysHappy"
*/
    String splitReverse(String string){
      int integerdivision = string.length() / 2;
      String first = string.substring(0, integerdivision);
      String second = string.substring(integerdivision);
      return second + first;
   }
   // THE LENGTH OF THE ARGUMENT MUST BE EVEN IN LENGTH(INTEGER DIVISION)
   // THE LENGTH OF THE ARGUMENT MUST BE EVEN IN LENGTH(INTEGER DIVISION)
   // THE LENGTH OF THE ARGUMENT MUST BE EVEN IN LENGTH(INTEGER DIVISION)
   
  /*    
    Problem 3:
    Write a function createUsername() that accepts a first name, last name and OSIS number and returns the first letter of the first name, the full lastname and the last four characters of the OSIS. Example: John Doe 123456789 ==> "JDoe6789"
  */
    String createUsername(String first, String last, String osis){
      String firstpart = first.substring(0,1);
      String osispart = osis.substring(osis.length()-4, osis.length());
      return firstpart + last + osispart;
}
}