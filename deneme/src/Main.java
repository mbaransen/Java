public class Main {
    public static void main(String[] args) {
     int[] sayilar = new int[]{1,2,3,4,5,6,9,0};
     int aranacakSayi = 6;
     boolean varMi = false;

     for (int sayi : sayilar){
       if (sayi==aranacakSayi){
           varMi = true;
           break;
       }
     }
    if(varMi==true){
        System.out.println("Sayı mevcuttur.");
    }else{
        System.out.println("Sayı mevcut değildir.");
    }
    }
}