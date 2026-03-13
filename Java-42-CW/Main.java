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
    // set up appropriate DB object to students.db
    Database db = new Database("jdbc:sqlite:students.db");	

    // 1: Add the course “MCLUB1” section 3 during period 1, with teacher1 as “WHOKNOWS”, room is “ROOFTOP” for STUDENT2.
    sql = "INSERT INTO cr101 (StudentID, Course, Section, Teacher1, Period, Room) VALUES ('STUDENT2', 'MCLUB1', 3, 'WHOKNOWS', 1, 'ROOFTOP') ;";
    db.runSQL(sql);
    sql = "SELECT * FROM cr101 WHERE StudentID = 'STUDENT2' AND Period = 1;";
    queryResult = db.runSQL(sql, "table-auto");
    print(queryResult);
    print("***********************");
//they duplicate because i am running the code multiple times to check
    // 2: For student with ID “STUDENT4”, add course “CN100” with a section 1, teacher1 as  “JOSEPH”, period 2 and room 108.
    sql = "INSERT INTO cr101 (StudentID, Course, Section, Teacher1, Period, Room) VALUES ('STUDENT4', 'CN100', 1, 'JOSEPH', 2, 108);";
    db.runSQL(sql);
    sql = "SELECT * FROM cr101 WHERE StudentID = 'STUDENT4' AND Period = 2;";
    queryResult = db.runSQL(sql, "table-auto");
    print(queryResult);
  }    
}