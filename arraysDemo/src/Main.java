public class Main {
    public static void main(String[] args) {
        //Diziler
        String[] ogrenciler = new String[3];//Dizi bu şekilde oluşturulur.Kaç eleman olacagı parantez içine yazılır.
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";//dizinin elemanlarını belirttim.

        for (int i = 0; i < ogrenciler.length; i++) {//i=0 dememin sebebi indexlerim 0 dan baslıyor .length dememizin sebebi eleman sayısı kadar yazdır demektir.
            System.out.println(ogrenciler[i]);
        }
        //for döngüsü ile yazdırma genel de bu şekil de yazılır.Üstteki kullanımın aynısıdır.For döngüsü ile kullanmayı ögren.
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}
