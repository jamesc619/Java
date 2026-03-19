import java.io.IOException;
import java.sql.*;
/*
Use the chinook database to write the SQL statements to produce the info asked (using chinookDBdiagram.jpg to decide which tables contain the required info and their relationships)
*/
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {

    String sql = "";
    String result ="";     
		Database db = new Database("jdbc:sqlite:chinook.db");	

    // Problem 1:
    // For the first 30 tracks, get the name of the track and the album name that it belongs to.
    sql = "SELECT tracks.name, albums.title FROM tracks INNER JOIN albums ON tracks.albumid = albums.albumid LIMIT 30;";
    result = db.runSQL(sql, "table-auto");
    print(result);
    print("*****************************");

    // Problem 2:
    // // For every Invoice in April 2012, retrieve the customer's first name & last name, invoice id, and invoice date.  (Invoice date format: YYYY-MM-DD)
    sql = "SELECT customers.firstname, customers.lastname, invoices.invoiceid, invoices.invoicedate FROM invoices INNER JOIN customers ON invoices.customerid = customers.customerid WHERE invoices.invoicedate LIKE '2012-04%';";
    result = db.runSQL(sql, "table-auto");
    print(result);
    print("*****************************");

    // Problem 3:
    // For the first 20 invoices, get the customer id, invoice id, track name, unit price and quantity. (Hint: information is across 3 tables)
    sql = "select invoices.customerid, invoices.invoiceid, tracks.name, invoice_items.unitprice, invoice_items.quantity FROM invoices, invoice_items, tracks WHERE invoices.invoiceid = invoice_items.invoiceid AND invoice_items.trackid = tracks.trackid limit 20;";
    result = db.runSQL(sql, "table-auto");
    print(result);
    print("*****************************");

    // Problem 4:
    // What is the list of customer names whose merchandise is being shipped either to the USA, Germany or Poland? (Hint: use BillingCountry in invoices table). (REMOVE DUPLICATES)
    sql = "select distinct customers.firstname, customers.lastname from customers inner join invoices on invoices.customerid = customers.customerid where invoices.billingcountry in('USA','GERMANY','POLAND');";
    result = db.runSQL(sql, "table-auto");
    print(result);
    print("*****************************");

    // Problem 5:
    // List the first 20 song(track) names that are “Latin” music (genre)?
    sql = "select tracks.name from tracks inner join genres on genres.genreid = tracks.genreid where genres.name = 'Latin' limit 20;";
    result = db.runSQL(sql, "table-auto");
    print(result);
    print("*****************************");
    // Problem 6:
    // List all the “Jazz” album titles. 'Jazz' is a genre. (REMOVE DUPLICATES)
  sql = "select distinct albums.title from albums, tracks, genres where tracks.albumid = albums.albumid and genres.genreid = tracks.genreid and genres.name = 'Jazz';";
    result = db.runSQL(sql, "table-auto");
  print(result);
  print("*****************************");

    // Problem 7:
    // List all the Pop Artist names. 'Pop' is a genre. (REMOVE DUPLICATES)
  sql  = "select distinct artists.name from artists, albums, tracks, genres where artists.artistid = albums.artistid and albums.albumid = tracks.albumid and tracks.genreid = genres.genreid and genres.name = 'Pop';";
    result = db.runSQL(sql, "table-auto");
  print(result);
  print("*****************************"); 
  }  
}