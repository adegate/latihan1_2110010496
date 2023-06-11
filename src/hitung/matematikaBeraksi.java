
package hitung;

public class matematikaBeraksi {
    public static void main(String[] args) {
        matematika ade = new matematika(9,6);
        
        System.out.println("Hasil Penjumlahan = " + ade.setPenjumlahan());
        System.out.println("Hasil Pengurangan = " + ade.setPengurangan());
        System.out.println("Hasil Perkalian = " + ade.setPerkalian());
        System.out.println("Hasil Pembagian = " + ade.setPembagian());
    }
}
