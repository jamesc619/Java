class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   System.out.println(collegeCredit("BNQMJE"));
   System.out.println(getCounselor("3C3"));
   System.out.println(imageType("TidalWave.PNG"));
    
  }
/*
Problem 1:
Write a function collegeCredit() that accepts a course code and if a course gets college credit return true otherwise return false. If the 6th letter of the course code is "E" or "M" then it is a college credit course.
*/
 boolean collegeCredit(String code){
  if(code.substring(5,6).equals("E")||code.substring(5,6).equals("M")){
    return true;
  }else{
    return false;
  }
 }


/*
Problem 2:
Write a function getCounselor() that accepts a student's official class code and returns their guidance counselor based on the either the first or the middle character of the official class code being:
B-Berrouet
C-Chu
D-Dinn
E-Eyzengart
F-Flores
G-Gibson
*/
String getCounselor(String cc){
  if(cc.substring(0,1).equals("B")||cc.substring(1,2).equals("B")){
    return "Berrouet";
  }else if(cc.substring(0,1).equals("C")||cc.substring(1,2).equals("C")){
    return "Chu";
  }else if(cc.substring(0,1).equals("D")||cc.substring(1,2).equals("D")){
    return "Dinn";
  }else if(cc.substring(0,1).equals("E")||cc.substring(1,2).equals("E")){
    return "Eyzengart";
  }else if(cc.substring(0,1).equals("F")||cc.substring(1,2).equals("F")){
    return "Flores";
  }else if(cc.substring(0,1).equals("G")||cc.substring(1,2).equals("G")){
    return "Gibson";
  }else{
    return "error";
  }
}

/*  
Problem 3:
Write a function imageType() that accepts an image filename and returns the image type based on the file extension.

JPEG or JPG - Joint Photographic Experts Group
PNG - Portable Network Graphics
GIF - Graphics Interchange Format
PDF - Portable Document Format(not an image type)
*/ 
String imageType(String filename){
  if(filename.substring(filename.indexOf("."))=="JPEG"||filename.substring(filename.indexOf("."))=="JPG"){
    return "Joint Photographics Experts Group";
  }else if (filename.substring(filename.indexOf(".")+1).equalsIgnoreCase("PNG")){
    return "Portable Network Graphics";
  }else if (filename.substring(filename.indexOf(".")+1).equalsIgnoreCase("GIF")){
    return "Graphics Interchange Format";
  }else if (filename.substring(filename.indexOf(".")+1).equalsIgnoreCase("PDF")){
    return "Portable Document Format(not an image)";
  }else{
    return "error";
  }
}
 
  
}