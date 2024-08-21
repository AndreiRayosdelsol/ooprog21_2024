public class MovieQuoteInfo {

    public static void main(String[] args) {
        
        MovieQuoteInfo movieQuote = new MovieQuoteInfo();

        // Print the movie quote information
        movieQuote.printQuote();
    }

   
    public void printQuote() {
        String quote = "\"My mama always said life was like a box of chocolates. You never know what you're gonna get.\"";
        String movie = "Forrest Gump";
        String character = "Forrest Gump";
        int year = 1994;

        System.out.println("Quote: " + quote);
        System.out.println("Movie: " + movie);
        System.out.println("Character: " + character);
        System.out.println("Year: " + year);
    }
}
