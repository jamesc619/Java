class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    print(swapCharacter("Fuck", "u", "*"));
    print(encryption2("abcdefgh"));
    print(encryption3("abcdef"));
    
  }

  // reverse function for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }

  /*
  Problem 1:
  Write a function swapCharacter() that accepts a string to modify, a string(one character) to find, and a string(one character) to replace. The function returns a string with the 'find' strings replaced by the 'replace' string.
  Example: swapCharacter("the seen","e","%")  ==> "th% s%%n"
  */
 String swapCharacter(String msg, String find, String replace){
  String build = "";
  for(int i=0;i<=msg.length()-1;i++){
    if(msg.substring(i,i+1).equalsIgnoreCase(find)){
      build+= replace;
    }else{
      build+=msg.substring(i,i+1);
    }
  }
  return build;
 }

  /*
  Problem 2:
  Write a function encryption2() that accepts a string and returns the string where the orginal string is split in half and each letter from each half is used to create a new string.
  Examples:
  encryption2("abcdefgh") ==> "aebfcgdh"
    process:  "abcdefgh" -> "abcd" "efgh"  -> "aebfcgdh"

  encryption2("abcdefghi") ==> "aebfcgdhi"
   process:  "abcdefghi" -> "abcd" "efghi"  -> "aebfcgdhi"
  */
 String encryption2(String msg1){
  String build = "";
  int length = msg1.length();
  String first = msg1.substring(0,length/2);
  String second = msg1.substring(length/2);
  for(int i=0;i<=first.length()-1;i++){
    build += first.substring(i,i+1) + second.substring(i,i+1);
  }
  if(length%2==1){
    build+= second.substring(second.length()-1);
  }
  return build;
 }
  
  /*
  Problem 3:
  Write a function encryption3() that accepts a string and returns the string that rearranges the characters of the original string in the order: 1st,last,2nd,last-1,3rd,last-2,...   and so on.
  Example:
  encryption3("abcdef")==> "afbecd"
  encryption3("abcde")==> "aebdc"
  */
  String encryption3(String msg2){
    String build = "";
    int msglength = msg2.length();
    String firsth = msg2.substring(0,msglength/2);
    String secondhRvrs = reverse(msg2.substring(msglength/2));
  
    for(int i=0;i<=firsth.length()-1;i++){
    build += firsth.substring(i,i+1) + secondhRvrs.substring(i,i+1);
  }
  if(msglength%2==1){
    build+= secondhRvrs.substring(secondhRvrs.length()-1);
  }
  return build;
  }
}