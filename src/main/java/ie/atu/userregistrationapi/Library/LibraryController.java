package ie.atu.userregistrationapi.Library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class LibraryController {
    private LibraryService libraryService;  //Create libraryService instance to later pass info

    @Autowired
    public void LibraryController(LibraryService libService) {
        this.libraryService = libService;
    }

    @GetMapping("/getBook")     //Retrieve book arrayList object
    public ArrayList<Book> getBook() {
        return libraryService.getBook();
    }

    @PostMapping("/addBook")    //Pass book object data in POST body to library service
    @ResponseStatus(HttpStatus.CREATED)
    public Object registerBookDetails(@RequestBody Book book) {
        libraryService.addBook(book);
        //System.out.println(book);
        return libraryService.getBook();
    }

}
