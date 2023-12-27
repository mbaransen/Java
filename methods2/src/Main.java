public class Main {
    public static void main(String[] args) {
    //Void operasyonu emir verir bunu yap dersin onu yapar.
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = sehirVer();//asagıda sehirVeri String olarak tanımladıgım icin yazabilirim. public static int dersek olmaz.
        System.out.println(yeniMesaj);

    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    //return eden fonksiyonlar

    public static int topla(){//void yerine int yazdım yani bu fonksiyon void yerine int döndürür.
     return 5;
    }
    public static String sehirVer(){
        return "Ankara";
    }

}