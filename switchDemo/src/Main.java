
public class Main {
    public static void main(String[] args) {
     //Switch if e göre daha az kullanılır.
        char grade = 'A';


        switch (grade){
            case 'A'://case vererek durumları belirtiriz yani burada A gelmesi durumunda ne olacagını yazacagım.Case iki nokta konur.
                System.out.println("Mükemmel : Geçtiniz");
                break;//case ile durumu belirttikten sonra break ile bitirmeliyim.
            case 'B':
                    System.out.println("Çok Güzel : Geçtiniz");
                    break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default://case dışındaki diger durumlar default ile yazılır.
                System.out.println("Geçersiz Not Girdiniz");
        }
    }
}