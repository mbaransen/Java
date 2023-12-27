public class Main {
    public static void main(String[] args) {
     double[] myList ={1.2,1.3,1.4,1.5};//elemanları bu şekilde ekledim.
     double total=0;
     double max = myList[0];//myListin 0.elemanını max olarak tanımladım.
        for(double number:myList){

            if(max<number){
                max = number;
            }

            total = total + number;// Yukarıda total diye bir degr tanımlayıp 0 verdik burada ise degerlerin toplamını yazdıracağız.
            System.out.println(number);
        }

        System.out.println("Toplam = " + total);
        System.out.println("En Büyük = " + max);
    }
}