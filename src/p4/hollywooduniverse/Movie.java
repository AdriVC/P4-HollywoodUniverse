
package p4.hollywooduniverse;

public class Movie {
    
    private int year;
    private String title;
    private String studio;

    public Movie(int year, String title, String studio) {
        this.year = year;
        this.title = title;
        this.studio = studio;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
    
    
}
