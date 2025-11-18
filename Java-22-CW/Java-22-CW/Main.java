class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

  /*
    Problem 1: 
    a) Create an array of the names of your friends.
    b) Print the 2nd name
    c) Print the size of the array
    d) Print the 2nd last name using the array size.
    e) Use the fn showArray[] provided below to display the array of friend names.
  */
        String[] names = {"Haotian","ryan", "Asael", "Leonardo", "Steven"};
        System.out.println("2nd: "+names[1]);
        System.out.println("length: "+names.length);
        System.out.println("last: "+names[(names.length)-1]);
        showArray(names);
        double[] tempC = {0.0, 30.0, 37.0, 100.0};
        showArrayDoubles(convertTempCtoF(tempC));
  }

  /*
  Problem 2:
  Write a function convertTempCtoF() that accepts an array of Celsius temperature values, converts each value to Fahrenheit scale, and returns a new array with the converted temperatures. (Use the celsiusToFahrenheit function provided)
  NOTE: To test this function, create an array tempC in celsius which you will pass to test your new function.
  */

  double[] convertTempCtoF(double[] tempC){
    double[] tempF = new double[tempC.length];
    for(int i=0; i < tempC.length; i++){
      tempF[i] = celsiusToFahrenheit(tempC[i]);
    }
    return tempF;
  }

  // Function to print all the elements of an array (use a 'for' loop to traverse the array)
  void showArray(String[] a){    
    for(int x=0; x <= a.length-1; x++){      
      printt(a[x] +", "); // print(a[x]);
    }
     print("");
  }

    void showArrayDoubles(double[] a){    
    for(int x=0; x <= a.length-1; x++){      
      printt(a[x] +", "); // print(a[x]);
    }
     print("");
  }
  // fn to convert temp from degC to degF
  double celsiusToFahrenheit(double c){
        return c*9/5+32;
  }
  
}