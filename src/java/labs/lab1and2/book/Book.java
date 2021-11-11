package java.labs.lab1and2.book;

public class Book {
    private String name, author;
    private int year;
    double cost;

    public Book(String name, String author, int year, double cost){
        this.name = name;
        this.author = author;
        this.year = year;
        this.cost = cost;
    }

    public String getName (){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void displayInfo() {
        System.out.println("name: "+name+", author: "+author+", year: "+year + ", cost: " +cost);
    }
}
