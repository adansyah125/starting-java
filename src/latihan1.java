import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class latihan1 {
    static class Produk{
        String nama;
        double harga;

        Produk (String nama, double harga){
            this.nama = nama;
            this.harga = harga;
        }
        @Override
        public String toString() {
            return "{" + nama + ", " + harga + "}";
        }
    }
    public static void main(String[] args) {
        List<Produk> daftarProduk = new ArrayList<>();

        daftarProduk.add(new Produk("Sabun", 3000));
        daftarProduk.add(new Produk("sampo", 8000));
        daftarProduk.add(new Produk("beras", 23000));

        List<Produk> namaProdukmahal = daftarProduk.stream()
            .filter(p -> p.harga > 5000)
            .collect(Collectors.toList());

        System.out.println(namaProdukmahal); 
    }
}
