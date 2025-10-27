class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println(approxPI(5));
    System.out.println(approxPIagain(10000));

  }
  /* 1:   Write a function approxPI() that accepts a value for a # of terms and approximates the value of PI. (See the general forumula described in the file PI.png)

    Example: if # of terms = 5,
    approxPI = 4(1 - 1/3 + 1/5 - 1/7 + 1/9) = 3.3396825396825403
  */
 double approxPI(int terms){
  double pi=0.0;
  for(int i=0;i<=terms;i++){
    if(i%2==0){
      pi+=1.0/(2*i+1);
    }else{
      pi-=1.0/(2*i+1);
    }
 }
 return pi*4;
 }
  
  /* 2:  In order to get a more accurate approximation of PI (say, to the thousandths place), run your loop passing multiples of ten from 100 through 100000 for the # of terms).
  */
 double approxPIagain(int terms){
  double pi=0.0;
  for(int i=0;i<terms;i++){
    if(i%2==0){
      pi+=1.0/(2*i+1);
    }else{
      pi-=1.0/(2*i+1);
    }
 }
 return pi*4;
 }
  
}