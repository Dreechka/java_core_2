package NatysTask;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*List<MyPrecious> coins = new ArrayList<>();
        Coin coin1 = new Coin(new BigDecimal("1.0"), new BigDecimal("10.0"));
        Coin coin2 = new Coin(new BigDecimal("2.0"), new BigDecimal("20.0"));
        coins.add(coin1);
        coins.add(coin2);

        List<MyPrecious> stamps = new ArrayList<>();
        Stamp stamp1 = new Stamp(new BigDecimal("15.0"));
        Stamp stamp2 = new Stamp(new BigDecimal("25.0"));
        stamps.add(stamp1);
        stamps.add(stamp2);

        NssPersonalCollection nssPersonalCollection = new NssPersonalCollection(coins, stamps);
        System.out.println("Содержимое коллекции №1: " + nssPersonalCollection.getCollectionValue());

        NssPersonalCollection nssPersonalCollection2 = new NssPersonalCollection(nssPersonalCollection);
        System.out.println("Содержимое коллекции №2: " + nssPersonalCollection2.getCollectionValue());

        nssPersonalCollection.add(stamp1);
        System.out.println(nssPersonalCollection.get(2));*/

        double increment = 0.01123;
        double result;
        int count = 0;
        for (result = 0; result < 1_000_000; result = result + increment) {
            count = count + 1;
            if (increment < 0) {
                break;
            }
            //System.out.println(count);
        }
        System.out.println(count);

        /*for (result = 0; result < 1_000_000; ) {
            if (increment < 0)
                break;
            count++;
            result = result + increment;
        }
        System.out.println(count);*/


    }
}
