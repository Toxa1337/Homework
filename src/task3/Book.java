package task3;

public class Book {
    private String name;
    private String author;
    private int pubDate;
    private String cover;
    private String publisher;
    private int pagesNumber;

    public Book(String n, String a, int pd, String c, String p, int pn) {
        name = n;
        author = a;
        pubDate = pd;
        cover = c;
        publisher = p;
        pagesNumber = pn;
    }

    public Book(String n, String a, int pd, String c, String p) {
        name = n;
        author = a;
        pubDate = pd;
        cover = c;
        publisher = p;
        pagesNumber = 150;
    }

    public Book(String n, String a, int pd, String c) {
        name = n;
        author = a;
        pubDate = pd;
        cover = c;
        publisher = "Book Paradise";
        pagesNumber = 150;
    }

    public Book(String n, String a, int pd) {
        name = n;
        author = a;
        pubDate = pd;
        cover = "hard";
        publisher = "Book Paradise";
        pagesNumber = 150;
    }

    public Book(String n, String a) {
        name = n;
        author = a;
        pubDate = 2021;
        cover = "hard";
        publisher = "Book Paradise";
        pagesNumber = 150;
    }

    public Book(String n) {
        name = n;
        author = "Pushkin";
        pubDate = 2021;
        cover = "hard";
        publisher = "Book Paradise";
        pagesNumber = 150;
    }

    public Book() {
        name = "Dubrovskii";
        author = "Pushkin";
        pubDate = 2021;
        cover = "hard";
        publisher = "Book Paradise";
        pagesNumber = 150;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPubDate(int pubDate) {
        this.pubDate = pubDate;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPubDate() {
        return pubDate;
    }

    public String getCover() {
        return cover;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public String toString() {
        return this.name + " by " + this.author + " published in " + this.pubDate + " has a " + this.cover + " cover and has " + this.pagesNumber + " pages. Published by " + this.publisher;
    }
}
