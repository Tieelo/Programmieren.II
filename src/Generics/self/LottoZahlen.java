package Generics.self;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class LottoZahlen {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random rand = new Random();

        for(int i = 1; i<=7;i++ ){
            set.add(i);
        }
        for (int i =0; i<6;i++){
            int n = rand.nextInt(50);
            if(set.contains(n)){
                System.out.println(n);
                set.remove(n);
            }
            else{
                i = i-1;
            }
        }
    }
    //Mit dem jetzigen Container kann man zum einen sicher gehen, dass ein Objekt nur einmal vorhanden ist im Set und zum Anderen kann man sehr schnell auf die Stelle
    //des jeweiligen wertes zugreifen und diesen Finden (Ohne Index)

}