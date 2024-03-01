import java.util.Arrays;

public class Main {

    public static void cevir (int [][] matrix) {
    int [][] yeniMatris = new int [matrix[0].length][matrix.length]; //yeniMatris adında yeni bir dizi oluştur
    for (int satir = 0; satir < matrix.length; satir++) {            //satırları dön
        for (int sutun = 0; sutun < matrix[0].length; sutun++) {     // sütunları dön
            yeniMatris[sutun][satir] = matrix [satir][sutun];        //matris dizisinin elemanları sütunlar ve satırlar yer değiştirirerek yeniMatris dizisine kopyalanır
        }
    }
    yazArray(yeniMatris); //metodu çağrılarak, yeniMatris'i çağır
}
    public static void yazArray(int [][] matrix) {
        for (int [] satir : matrix) {
            for (int sutun : satir) {
                System.out.print("  " + sutun + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] matris = { {1,2,3},            // çok boyutlu bir dizi oluştu
                            {4,5,6} };
        System.out.println("=====Öncesi=====");
        yazArray(matris);                     //öncesi için, bu metot çağrırılarak
        System.out.println("====Sonrası====");
        cevir(matris);                          //sonrası için, bu metot çağrırılarak
    }

}