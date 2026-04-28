import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class praktek {
    static class Produk {
        String nama;
        double harga;

        public Produk(String nama, double harga){
            this.nama = nama;
            this.harga = harga;
        }

        @Override
        public String toString(){
            return "{" + nama + ", " + harga + "}";
        }
    }
    public static void main(String[] args) {
        List<Produk> daftarProduk = new ArrayList<>();

        daftarProduk.add(new Produk("sabun", 5000));
        daftarProduk.add(new Produk("sampo", 8000));
        daftarProduk.add(new Produk("beras", 23000));

        List<Produk> daftarProdukmahal = daftarProduk.stream()
            .filter(n -> n.harga > 5000)
            .collect(Collectors.toList());

        System.out.println(daftarProdukmahal);
    }
}
