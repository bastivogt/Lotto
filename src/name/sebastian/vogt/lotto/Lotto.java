package name.sebastian.vogt.lotto;


import java.util.ArrayList;
import java.util.Collections;

public class Lotto {

    protected ArrayList<Object> allNumbers;


    protected int[] myNumbers;

    protected int allNumbersLength;
    protected int myNumbersLength;


    public Lotto(int myNumbersLength, int allNumbersLength) {

        this.reset(myNumbersLength, allNumbersLength);

    }

    public void reset(int myNumbersLength, int allNumbersLength) {
        this.myNumbersLength = myNumbersLength;
        this.allNumbersLength = allNumbersLength;
        this.myNumbers = new int[this.myNumbersLength];

        this.allNumbers = new ArrayList<Object>();

        this.prepare();
        this.shuffle();
    }

    protected void prepare() {
        for(int i = 0; i < this.allNumbersLength; i ++) {
            this.allNumbers.add(i + 1);

        }
    }

    protected void shuffle() {
        Collections.shuffle(this.allNumbers);
    }

    protected int randomBetween(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min) + min);
    }

    public int[] getNumbers() {
        int randomNumber;
        for(int i = 0; i < this.myNumbers.length; i ++) {
            randomNumber = this.randomBetween(0, this.allNumbers.size());
            this.myNumbers[i] = (int) this.allNumbers.get(randomNumber);
            this.allNumbers.remove(randomNumber);
            this.shuffle();
        }
        return this.myNumbers;
    }

    public int getSuperNumber() {
        this.shuffle();
        return (int) this.allNumbers.get(this.randomBetween(0, this.allNumbers.size()));
    }


}
