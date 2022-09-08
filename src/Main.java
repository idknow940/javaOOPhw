import model.IntegerTester;
import model.SimpleCounter;
import model.Tester;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> aL = new ArrayList<>();
        List<Integer> lL = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            Integer next = random.nextInt();
            aL.add(next);
            lL.add(next);
        }
        SimpleCounter sC = new SimpleCounter();
        Tester tester = new IntegerTester(aL);
        System.out.println("ArrayList: " + sC.timeIt(tester)/1000.000 + "s");
        tester = new IntegerTester(lL);
        System.out.println("LinkedList: " + sC.timeIt(tester)/1000.000 + "s");
    }
}
