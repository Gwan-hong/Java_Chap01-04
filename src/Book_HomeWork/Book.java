package Book_HomeWork;

import java.util.Objects;

class Book {
    private static int nextID = 1001;

    private final int idNum;
    private String title;
    private String author;
    private int pages;
    private boolean isborrowed;

    public Book(String title, String author, int pages) {
        this.idNum = nextID++;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isborrowed = false;
    }

    public int getIdNum() {
        return idNum;
    }

    public String  getTitle() {
        return title;
    }

    public String  getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public boolean isBorrowed() {
        return isborrowed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean borrow() {
        if (isborrowed) return false;
        isborrowed = true;
        return true;
    }

    public boolean returnBook() {
        if (!isborrowed) return false;
        isborrowed = false;
        return true;
    }

    public String getInfo() {
        return String.format("[%d] %s - %s (%d쪽) %s", idNum, title, author, pages, isborrowed ? "[대출증]" : "[대여가능]");
    }

    @Override
    public String toString() {
        return getInfo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(getClass(), title, author, pages);
    }
}
