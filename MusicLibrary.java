/*
 * Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.
 */

import java.util.ArrayList;

class MusicLibrary{
       private ArrayList < String > songs;
       


       public MusicLibrary(){
        this.songs = new ArrayList < String > ();     
 }

        public ArrayList < String > getSongs() {
            return songs;
        }

        public void addSongs(String song) {
            songs.add(song);
          }
        
          public void removeSong(String song) {
              songs.remove(song);
          }

          public void playRandom() {
               
          }

      
          public static void main(String[] args) {
               MusicLibrary music1 = new MusicLibrary();

               music1.addSongs("Dem bobo");
               music1.addSongs("Now you see");
               music1.addSongs("I wanna be free");
               music1.addSongs("Wey our money");

            //    sch1.addStudent("Raymond");
            //    sch1.addStudent("Samuel");
            //    sch1.addStudent("buzo");

            //    sch1.addTeachers("Benjamin");
            //    sch1.addTeachers("Rufus");

            //    sch1.addClasses("CHM101");

            //    System.out.println("Student: " + sch1.getStudents());

            // //remove Student ray
            // sch1.removeStudent("buzo");
            // System.out.println("After removal of buzo");
            // System.out.println("Student: " + sch1.getStudents());
          }


  }