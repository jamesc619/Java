class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   String msg = Input.readFile("paragraph.txt");
   print(numOfWords(msg));
   print(countVowels(msg));
    
  

  }
  // For each problem read from the file paragraph.txt .

  /*
  Problem 1:
  Write a function numOfWords() that accepts a string and counts the number of words in the string.
  Example: "To be or not to be"  ==> 6
  */
	int numOfWords(String msg){
		int count = 1;
			for(int i=0;i<msg.length();i++){
				if(msg.substring(i,i+1)..equalsIgnoreCase(" ")){
					count ++;
				}
			}
		return count;
	}
	

  /*
  Problem 2:
  Write a function countVowels() that accepts a string and returns the number of vowels contained in the string.
  Example: countVowels("To be or not to be") ==> 7
  */

  	int countVowels(String msg){
		int count = 0;
			for(int i=0;i<msg.length();i++){
				if(msg.substring(i,i+1)..equalsIgnoreCase("a")||(msg.substring(i,i+1)..equalsIgnoreCase("e"))||msg.substring(i,i+1)..equalsIgnoreCase("i")||msg.substring(i,i+1)..equalsIgnoreCase("o")||msg.substring(i,i+1)..equalsIgnoreCase("u")){
					count ++;
				}
			}
		return count;
	}
  
}