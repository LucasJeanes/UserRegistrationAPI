package ie.atu.userregistrationapi.Library;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {     //Use Lombok to streamline the class creation by automating constructors/Getters & Setters
    private String title;
    private String author;
    private int isbn;
    private int publishedYear;
}
