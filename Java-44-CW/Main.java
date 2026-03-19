import java.io.IOException;
import java.sql.*;
/*
Use the chinook database to write the SQL statements to produce the info asked (using chinookDBdiagram.jpg to decide which tables contain the required info and their relationships)

Problem 1:
List the first 20 album titles with the name of the artist who produced the album.

Problem 2:
List the first 20 song(track) names that are of the following genres: Blues, Latin, Pop, Classical.

Problem 3:
List the first 20 song(track) names that are in the playlist 'Grunge'. 
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
// List the first 20 album titles with the name of the artist who produced the album.
  sql = "SELECT albums.title, artists.name FROM albums INNER JOIN artists ON artists.artistid = albums.artistid LIMIT 20;";
  result = db.runSQL(sql, "table-auto");
  print(result);
  print("*******************");

// Problem 2:
// List the first 20 song(track) names that are of the following genres: Blues, Latin, Pop, Classical.
  sql = "SELECT tracks.name FROM tracks INNER JOIN genres ON genres.genreid = tracks.genreid WHERE genres.name IN('Blues','Latin','Pop','Classical') LIMIT 20;";
  result = db.runSQL(sql, "table-auto");
  print(result);
  print("*****************************");

// Problem 3:
// List the first 20 song(track) names that are in the playlist 'Grunge'. 
  sql = "SELECT tracks.name FROM tracks, playlist_track, playlists WHERE playlists.playlistid = playlist_track.playlistid AND playlist_track.trackid = tracks.trackid AND playlists.name = 'Grunge' LIMIT 20;";
  result = db.runSQL(sql, "table-auto");
  print(result);
  print("*******************");   
  }    
}