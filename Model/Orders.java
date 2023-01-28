package Model;


public class Orders {
    ArrayList<Books> books;

    public Orders(ArrayList<Books> books) {
        this.books = books;
    }

    public ArrayList<Books> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Books> books) {
        this.books = books;
    }
}