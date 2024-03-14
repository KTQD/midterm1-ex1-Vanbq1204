public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("MP3 Player", "Portable music player", "MP001", 50.0f, "3 hours");
        mp3.showInfo();
        Book book = new Book("Java Programming", "Learning Java programming language", "B001", 30.0f, "John Doe", 400, "Programming");
        book.showInfo();
    }
}
