abstract class Item {
    public String name;
    private String description ;
    protected String ID;
    float price;
    public String getDescription(){
        return description;
    }
    public String setDescription(){
        return this.description= description;
    }
    public abstract void showInfo();

    public Item (String name, String description, String ID,float price){
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.price = price;
    }
}
