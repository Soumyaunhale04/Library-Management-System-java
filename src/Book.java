public class Book {
    private int id;
    private String author;
    private String title;
    private boolean isIssued;

    Book(int id, String author, String title){
        this.id = id;
        this.author = author;
        this.title = title;
        this.isIssued = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }
    public void issueBook(){
        this.isIssued = true;
    }

    public void returnBook(){
        this.isIssued = false;
    }

    @Override
    public String toString() {
        return id+"|"+ title+"|"+ author+"|"+(isIssued? "Issued":"Available");
    }
}
