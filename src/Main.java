public class Main {
    public static void main(String[] args) {

        MP3 mp3 = new MP3("Song", "this is a song", "1234",123,290);
        mp3.showInfo();

        Book book = new Book("Book", "This is a book", "5678", 20.99f, "John Doe", 300, "Fiction");
        book.showInfo();
    }
}
