import java.util.*;
import java.util.stream.Collectors; 

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> angka = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> hasil = angka.stream()
            .filter(n -> n % 2 == 0)      // Menyaring angka genap [2, 4, 6]
            .map(n -> n * 2)               // Mengalikan setiap angka dengan 2 [4, 8, 12]
            .collect(Collectors.toList()); // Mengubah stream kembali menjadi List

        System.out.println(hasil); // Output: [4, 8, 12]
    }
}