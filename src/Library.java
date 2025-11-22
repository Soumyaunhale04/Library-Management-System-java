import java.util.*;

public class Library {
    TreeMap<Integer, Book> shelf;

    Library(){
        shelf = new TreeMap<>();
    }
    // add book
    public void addBook(Book book){
        int id = book.getId();
        if(shelf.containsKey(id)){
            System.out.println("Book with id: "+id+" already exists!");
            return;
        }
        shelf.put(id, book);
        System.out.println(book.getTitle()+" Book added successfully!");
    }
    //    issue book
    public  void issueBook(int id){
        if(shelf.containsKey(id)){
            Book book = shelf.get(id);
            if(!book.isIssued()){
                book.issueBook();
                System.out.println(book.getTitle() + " Book is issued!");
            }else System.out.println(book.getTitle()+" Book is already issued!");
        }else
            System.out.println("Book not found!");
    }



    //    return book
    public void returnBook(int id){
        if(shelf.containsKey(id)){
            Book book = shelf.get(id);
            if(book.isIssued()){
                book.returnBook();
                System.out.println(book.getTitle()+" Book is returned successfully!");
            }else System.out.println(book.getTitle()+" Book was not issued!");
        }else
            System.out.println("Book not found!");
    }


//    remove book
    public void removeBook(int id){
        if(shelf.containsKey(id)){
            Book book = shelf.get(id);
            if(book.isIssued()){
                System.out.println("Error: Book was issued, cannot remove!");
            }else {
                shelf.remove(id);
                System.out.println("Book removed!");
            }
        }else
            System.out.println("Book not found!");
    }

//    list book
    public void showBooks(){
        if(shelf.isEmpty()){
            System.out.println("No books in the library!");
        }
        for(Map.Entry<Integer, Book> entry : shelf.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
