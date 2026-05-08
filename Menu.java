abstract class Menu{
    public String makanan;
    public String minuman;
    public String snack;
    public String dessert;

    abstract Menu(String makanan, String minuman, String snack, String dessert){
        this.makanan = makanan;
        this.minuman = minuman;
        this.snack = snack 
        this.dessert = dessert;
    }
    
    public void pilihMenu() {
        System.out.println("Customer telah memilih menu");
    }
}
