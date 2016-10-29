package name.sebastian.vogt.lotto;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here


        for(int i = 0; i < 7; i ++) {
            int[] myNumbers = new int[6];
            Lotto lotto = new Lotto(6, 49);
            myNumbers = lotto.getNumbers();
            System.out.println(Arrays.toString(myNumbers));

            System.out.println("--------------------------------------------------------------");
        }

        System.out.println("Superzahl = " + Lotto.randomBetween(1, 9));

    }


}
