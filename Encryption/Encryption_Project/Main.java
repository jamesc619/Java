//James and Haotian
class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void init(){
// substitution of 10 characters
    char[] sub = new char[10];
    sub[0] = 'c';
    sub[1] = 'h';
    sub[2] = 'e';
    sub[3] = 'k';
    sub[4] = 'p';
    sub[5] = 'r';
    sub[6] = 's';
    sub[7] = 't';
    sub[8] = 'l';
    sub[9] = 'n';

    
    char[] sub2 =
    new char[10];
    sub2[0] = '\u008C';  // Œ
    sub2[1] = '\u009C';  // œ
    sub2[2] = '\u0099';  // ™
    sub2[3] = '\u0080';  // €
    sub2[4] = '\u0083';  //	ƒ
    sub2[5] = '\u0087';  // ‡
    sub2[6] = '\u008A';  // Š
    sub2[7] = '\u008E';  // Ž
    sub2[8] = '\u008B';  // ‹
    sub2[9] = '\u0095';  //	•

    System.out.println(textToAscii("{"));
    System.out.println(asciiToText(textToAscii("{")));


    //----------------------------------------------------------------

//Encode
    String file = Input.readFile("Original.txt");
    String encodedMsg = encode(file);
    Input.writeFile("Encode.txt",encodedMsg);

    String encodedMsg1 = substitution(encodedMsg, sub, sub2);
    Input.writeFile("Encode2.txt", encodedMsg1);

    String encodedMsg2 = textToAscii(encodedMsg1);
    Input.writeFile("Encode3.txt", encodedMsg2);
//----------------------------------------------------------------------------
//Decode
    String decodedMsg1 = asciiToText(encodedMsg2);
    Input.writeFile("Decode.txt", decodedMsg1);

    String decodedMsg2 = substitution(decodedMsg1, sub2, sub);
    Input.writeFile("Decode2.txt", decodedMsg2);

    String decodedMsg3 = decode(decodedMsg2);
    Input.writeFile("Decode3.txt", decodedMsg3);

    //------------------------------------------------------------------------------
  }
  // substitution encryption
  String substitution(String msg, char[] sub, char[] sub2){ // James
    String build = "";
    char ch ='\0';
    int index = -1;
    
    for(int x=0; x<=msg.length()-1; x++){
      ch = msg.charAt(x);
      index = indexOf(ch,sub);
      if(index != -1){
          build += sub2[index];
      }
      else{
          build += ch;
      }
    }
    return build;
  }
  // Encryption Caesar Cipher (2 letters with wrapping)
  // NOTE: TO CHANGE THE SHIFTING OF LETTERS, YOU HAVE TO MANUALLY ADD THE WRAPPING
   String encode(String txt){ //Haotian
    String build="";
    int ascii = 0;
    char ch = '\0'; //empty character

    for(int x=0; x<=txt.length()-1; x++){
      ch = txt.charAt(x);
      ascii = (int)ch;

      if(ascii == 90){ //make 'Z' into 'A'
        ascii = 65;
      }else if(ascii == 89){ //Y to B
        ascii = 66;
      }else if(ascii == 122){ //make 'z' into 'a'
        ascii = 97;
      }else if(ascii == 121){// y to b
        ascii = 98;
      }else{ //increment all other ASCII codes by 2
          ascii+=2;
      }
      build += (char)ascii;
    
    }
    return build;
  
   }

  //decryption caesar cipher (-2 letters with wrap)
  String decode(String txt){ // Haotian
    String build = "";
    int ascii = 0;
    char ch = '\0';

    for(int x=0; x<=txt.length()-1;x++){
      ch = txt.charAt(x);
      ascii = (int)ch;

            if(ascii == 65){ //make 'A' into 'Z'
        ascii = 90;
      }else if(ascii == 66){ //B to Y
        ascii = 89;
      }else if(ascii == 97){ //make 'a' into 'z'
        ascii = 122;
      }else if(ascii == 98){// b to y
        ascii = 121;
      }
      else{
        ascii -=2;  //decrement other ASCII codes by 2
      }
      build += (char)ascii;
    }
    return build;
  }
  String textToAscii(String text){ //James
    String build = "";
    for(int i=0; i<text.length(); i++){
      int asciivalue = text.charAt(i);
      build += asciivalue + "";
    }
    return build;
  }
String asciiToText(String asciii) { //James
    String build = "";
    int value = 0;
    int i = 0;
    while (i < asciii.length()) {
        if (asciii.substring(i,i+1).equals("1")) {
            value = Integer.parseInt(asciii.substring(i, i + 3));  // 3 digits
            i+=3;                                                                  // parseInt shoutout w3schools and mr joseph for showing me last year
        }else if(!asciii.substring(i,i+1).equals("1")){
            value = Integer.parseInt(asciii.substring(i, i + 2));  // 2 digits
            i+=2;
        }
        char charr = (char) value;
        build += charr;
    }
    return build;
}
  //finds index of character in an array
  int indexOf(char ch, char[] array){
    for(int x=0; x<=array.length-1; x++){
      if(array[x]==ch){
        return x;
      }
    }
    return -1; // index is -1 if not found
  }

  // random number generator
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}