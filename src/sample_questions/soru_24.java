package sample_questions;

import java.util.ArrayList;
import java.util.List;

public class soru_24 {
    public static void main(String[] args) {
        /*
        Soru 24-)
        20'den 0'a kadar çift sayıları yazdırın ancak decrement (i--) kullanmayın.
        Örnek:
        100'den 0'a kadar Çift Sayılar şunlardır: 20 18 16 14 12 10 8 6 4 2 0
        ipucu:
        Loop içinde if kullanarak çözebilirsiniz. % kullanmak iyi bir fikir olabilir
         */


        for (int i=20; i >=0; ) {
            if (i%2==0){
                System.out.print(i+" ");
                i-=2;
            }
        }

    }
}
