import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        Album album1 = new Album(1, "Andrew", "Best Album Ever", 2000, 30.5F, "rock");
        Album album2 = new Album(2, "Kyle", "2nd Best Album Ever", 2001, 29.5F, "pop");
        Album album3 = new Album(3, "Neil", "3rd Best Album Ever", 2002, 28.5F, "country");
        
        Author author1 = new Author(1, "Jeff", "Lowry");
        Author author2 = new Author(2, "Nelson", "John");
        Author author3 = new Author(3, "Harold", "Gerald");

        Quote quote1 = new Quote(1, "My name is Jeff Lowry", author1);
        Quote quote2 = new Quote(2, "My name is Nelson John", author2);
        Quote quote3 = new Quote(3, "My name is Harold Gerald", author3);

        List<Quote> quoteList = new ArrayList<Quote>(Arrays.asList(quote1, quote2, quote3));
        for (Quote quote : quoteList){
            System.out.println("Here's a quote: " + quote.getContent());
            System.out.println("And here's the author: " + quote.getAuthor().getFirstName() + " " + quote.getAuthor().getLastName());
        }

    }
}
