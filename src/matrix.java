public class matrix {
    public static void main(String[] args) {
        // Orijinal matrisi tanımladım.
        int[][] matris = {
                {2, 3, 4},
                {5, 6, 4}
        };

        // Matrisin satır ve sütun sayılarını belirledim
        int satirSayisi = matris.length;       // Matrisin kaç satırı olduğunu aldım
        int sutunSayisi = matris[0].length;    // İlk satırın eleman sayısını alarak sütun sayısını belirledim

        // Transpoz matrisi oluşturdum
        // Transpoz işlemi sonucunda satır ve sütun sayıları yer değiştirdiği için
        // yeni matrisin boyutlarını sutunSayisi satirSayisi olarak belirledim
        int[][] transpoz = new int[sutunSayisi][satirSayisi];

        // Matrisin transpozunu hesapladım
        for (int i = 0; i < satirSayisi; i++) {  // Satırlar üzerinde döndüm
            for (int j = 0; j < sutunSayisi; j++) { // Sütunlar üzerinde döndüm
                transpoz[j][i] = matris[i][j]; // Satır ve sütun yer değiştirerek yeni matrise atadım
            }
        }

        // Orijinal ve transpoz matrisleri ekrana yazdırdım
        System.out.println("Orijinal Matris:");
        matrisiYazdir(matris);

        System.out.println("Transpoz Matris:");
        matrisiYazdir(transpoz);
    }

    // Matrisi ekrana yazdıran fonksiyon yazdım
    static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) { // Satırlar üzerinde döndüm
            for (int j = 0; j < matris[i].length; j++) { // Sütunlar üzerinde döndüm
                System.out.print(matris[i][j] + " "); // Elemanı ekrana yazdırdım
            }
            System.out.println(); // Satır bittiğinde bir alt satıra geçtim
        }
    }
}


