public class Pembayaran{
    private String nama;
    private int nomorMeja;
    private double totalTagihan;
      
        public Pembayaran(String nama, int nomorMeja, double totalTagihan){
            this.nama = nama;
            this.nomorMeja = nomorMeja;
            this.totalTagihan = totalTagihan;
        }

        public void lakukanPembayaran(){
        if (jumlah <= saldo){
            saldo -= jumlah;
            System.out.println("Pembayaran Berhasil");
        }
        else{
            System.out.println("Pembayaran Gagal");

        }
    }

}
