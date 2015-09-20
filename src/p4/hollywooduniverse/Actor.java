
package p4.hollywooduniverse;

import java.util.ArrayList;
public class Actor {
    
    protected String name;
    protected String nacionality;
    protected int age;
    protected ArrayList <Movie> movies = new ArrayList();
    
    public Actor(String name, String nacionality, int age, ArrayList <Movie> movies){
        this.name = name;
        this.nacionality = nacionality;
        this.age = age;
        this.movies = movies;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getNacionality(){
        return nacionality;
    }
    
    public void setNacionality(String nacionality){
        this.nacionality = nacionality;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void addMovie(Movie m){
        movies.add(m);
    }
    
    
}
