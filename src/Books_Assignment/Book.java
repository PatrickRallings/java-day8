package Books_Assignment;

public class Book {
    public String title;
    public Integer pagesCount;
    public Integer yearPublished;

    public Book(String title, Integer pagesCount, Integer yearPublished) {
        this.title = title;
        this.pagesCount = pagesCount;
        this.yearPublished = yearPublished;
    }
    public Book(String title) {
        this.title = title;
    }
    public Book(Integer pagesCount) {
        this.pagesCount = pagesCount;
    }
    public Book(String title, Integer yearPublished) {
        this.title = title;
        this.yearPublished = yearPublished;
    }
    public Book(Integer pagesCount, Integer yearPublished) {
        this.pagesCount = pagesCount;
        this.yearPublished = yearPublished;
    }
    public Book() {
    }
    public String getTitle(){
        return this.title;
    }
    public Integer getPagesCount(){
        return this.pagesCount;
    }
    public Integer getYearPublished(){
        return this.yearPublished;
    }
    public String toString(String s){
        String output = null;
        if (s.equalsIgnoreCase("everything")){
            output =  getTitle()+", "+getPagesCount()+" pages, "+getYearPublished();
        } else if (s.equalsIgnoreCase("name")){
            output = getTitle();
        } else {
            return "You did not enter 'Everything' or 'Name'.";
        }
        return output;
    }
}
