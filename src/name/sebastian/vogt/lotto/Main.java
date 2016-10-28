package name.sebastian.vogt.lotto;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for(int i = 0; i < 10; i ++) {
            int[] myNumbers = new int[6];
            Lotto lotto = new Lotto(6, 49);
            myNumbers = lotto.getNumbers();
            showArray(myNumbers);
            System.out.println("Superzahl = " + lotto.getSuperNumber());
            System.out.println("--------------------------------------------------------------");
        }

    }
    public static void showArray(int[] array) {
        for(int i = 0; i < array.length; i ++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }


}
