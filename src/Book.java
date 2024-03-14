class Book extends Item {
    private String author;
    private int numberOfpages;
    private String genre;

    public Book(String name, String description, String ID, float price,
                String author, int numberOfpages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfpages = numberOfpages;
        this.genre = genre;
    }
    @Override
    public void showInfo(){
            System.out.println("Book Information:");
            System.out.println("Name: " + name);
            System.out.println("Description: " + getDescription());
            System.out.println("ID: " + ID);
            System.out.println("Price: " + price);
            System.out.println("Author: " + author);
            System.out.println("Number of Pages: " + numberOfpages);
            System.out.println("Genre: " + genre);
        }
}
