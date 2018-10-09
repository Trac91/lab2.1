public class Film {
    private String title;
    private String director;
    private int duration;
    private int count = 2;

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //Constructor
    // No argument constructor
    public Film()
    {
    this.title = "Unknown";
    this.director = "Unknown";
    this.duration = 0;
    this.count = 2;
    }
    // 3 argument constructor
    public Film(String title, String director, int duration)
    {
        setTitle(title);
        setDirector(director);
        setDuration(duration);
        setCount(count);
    }

    public String toString()
    {
        return "Title: "  + title + "\nDirector: " + director + "\nDuration: " + duration;
    }


    //  public String listObjectsCreated(String film)

}
