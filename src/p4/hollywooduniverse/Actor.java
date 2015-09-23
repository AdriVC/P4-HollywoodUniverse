
package p4.hollywooduniverse;

import java.util.ArrayList;
public class Actor {
    
    protected String name;
    protected String nacionality;
    protected int age;
    protected ArrayList <Movie> movies = new ArrayList();
    protected ArrayList <ArrayList> relaciones = new ArrayList();
    
    public Actor(String name, String nacionality, int age, ArrayList <Movie> movies){
        this.name = name;
        this.nacionality = nacionality;
        this.age = age;
        this.movies = movies;
        ArrayList<Actor> persona = new ArrayList();
        this.relaciones.add(persona);
        ArrayList<String> relacion = new ArrayList();
        this.relaciones.add(relacion);
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

    @Override
    public String toString() {
        return name;
    }
    
    public Actor(){
        
    }
    
    
}
