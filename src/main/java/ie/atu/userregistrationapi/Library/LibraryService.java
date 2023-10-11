package ie.atu.userregistrationapi.Library;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class LibraryService {
    public ArrayList<Book> bookArrayList = new ArrayList<>();   //Create new book ArrayList to store book info
    public void addBook(Book book) {    //Method to add book object details to new arrayList instance
        bookArrayList.add(book);
    }
    public ArrayList<Book> getBook() {  //Retrieve the ArrayList object info
        return bookArrayList;
    }
}
