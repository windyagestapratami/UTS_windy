public class Kasir{
    private String nama;
    private int nomorMeja;

        abstract Menu(String nama, int nomorMeja){
        this.nama = nama;
        this.nomorMeja = nomorMeja;

    public void pesanMenu() {
        System.out.println("Menu dipesan, mohon ditunggu terima kasih");
    }
}
