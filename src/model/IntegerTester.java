package model;

import java.util.Collection;
import java.util.Iterator;

public class IntegerTester implements Tester{
    Collection<Integer> c;

    public IntegerTester(Collection<Integer> c) {
        this.c = c;
    }

    public Collection<Integer> getC() {
        return c;
    }

    public void test(){
        Iterator<Integer> iterator = c.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
    }

    @Override
    public String toString() {
        return getC().toString();
    }
}
