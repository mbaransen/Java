public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);

      /*  System.out.println("Eleman sayısı : "+mesaj.length());//eleman sayısını verir.
        System.out.println("5.eleman : "+mesaj.charAt(4));//5.karakteri bulmamı saglar.
        System.out.println(mesaj.concat(" Yaşasın!"));//string eklememi saglar Bugün hava çok güzel e Yaşasın! ekledik.
        System.out.println(mesaj.startsWith("B"));//B ile başlayıp başlamadıgını kontrol ettik true veya false döndürür.
        System.out.println(mesaj.endsWith("m"));//cümlenin sonu m ile mi bitiyor kontrol ettik true veya false döndürür.
        System.out.println(mesaj.indexOf("a"));//a harfinin kaçıncı index de oldugunu gösterir.ÖNEMLİ!*/


        System.out.println(mesaj.replace(' ','-'));//Bosluk olan yerleri - işareti ekle demektir.ÖNEMLİ!
        System.out.println(mesaj.substring(2,5));//2.indexden itibaren 5.indexe kadar oku/kes demektir.
        System.out.println(mesaj.toLowerCase());//Bütün harfleri küçük harfe çevir.Veritabanı sorgularında çok kullanılır.
        System.out.println(mesaj.toUpperCase());//Bütün harfleri büyük harfe çevir.
    }
}