package set.scenarios;
// A Java program to demonstrate use of Comparable
import java.io.*;
import java.util.*;
 
// A class 'Movie' that implements Comparable
class MovieComparable implements Comparable<MovieComparable>
{
    private double rating;
    private String name;
    private int year;
 
    // Used to sort movies by year
    public int compareTo(MovieComparable m)
    {
        return this.year - m.year;
    }
 
    // Constructor
    public MovieComparable(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }
 
    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }
}
 
// Driver class
class Main1
{
    public static void main(String[] args)
    {
        ArrayList<MovieComparable> list = new ArrayList<MovieComparable>();
        list.add(new MovieComparable("Force Awakens", 8.3, 2015));
        list.add(new MovieComparable("Star Wars", 8.7, 1977));
        list.add(new MovieComparable("Empire Strikes Back", 8.8, 1980));
        list.add(new MovieComparable("Return of the Jedi", 8.4, 1983));
 
        Collections.sort(list);
 
        System.out.println("Movies after sorting : ");
        for (MovieComparable movie: list)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }
    }
}