
public class Main {
    public static void main(String[] args) {
      //For Döngüsü
       for (int i=1;i<10;i++){//i yi 1 den başla 10 dan küçük olana kadar yazdır demektir.i+=2 dersen 2 şer 2 şer arttır demektir.
    System.out.println(i);

       }
       System.out.println("For Döngüsü Bitti");

    //While Döngüsü
    int i=1;//i yi yeniden tanımlamam gerek çünkü parantezler dışına çıktım.
    while (i<10) {//while da i=1 gibi şeyler yazılmaz direkt şart verilir.While ile yapılan çogu şey for ile de yapılabilir.
         System.out.println(i);
         i++;
    }
        System.out.println("While Döngüsü Bitti");

    //Do-While(Çok fazla kullanılmaz)
    //Do-While ın Do dan farkı;şart saglanmasa bile çalışır.
        int j=1;//j tanımlıyorum.
        do {
            System.out.println(j);
            j += 2;//j yi 2 arttır demektir.
        } while (j < 10) ;
        System.out.println("Do-While Döngüsü Bitti");
    }
}