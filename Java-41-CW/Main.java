import java.io.IOException;
import java.sql.*;
// To Compile on the Replit shell use: (same as for mac)
// javac -cp sqlite-jdbc-3.23.1.jar: Main.java

// To compile in Windows use:
// javac -cp sqlite-jdbc-3.23.1.jar

// To execute(run) use:
// java -cp sqlite-jdbc-3.23.1.jar: Main
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {
     
      String sql = "";
      String queryResult = "";
      // set up appropriate DB object to CR101
		  Database db = new Database("jdbc:sqlite:cr101.db");	

      // TASK 1: Change Mr. Porchetta’s 10th period room to 323
      sql = "UPDATE cr101 Room = 323 WHERE Period = 10 AND Teacher1 = 'PORCHETTA';";
      db.runSQL(sql);
      sql = "SELECT * FROM cr101 WHERE Period = 10 AND Teacher1 ='PORCHETTA';";
      queryResult = db.runSQL(sql, "table-auto");
      print(queryResult);
      print("*******************");

      // TASK 2: Remove Mr. Castro's (“CASTRO R”) 2nd period class records.
      sql = "DELETE FROM cr101 WHERE Teacher1 = 'CASTRO R' AND Period = 2;";
      db.runSQL(sql);
      sql = "SELECT * FROM cr101 WHERE Teacher1 = 'CASTRO R' AND Period = 2;";
      queryResult = db.runSQL(sql, "table-auto");
      print(queryResult);
      print("*******************");
      
      
	   
      
  }    
}