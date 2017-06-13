package kitcenter.app.homework.lesson13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by annabilous on 6/13/17.
 */
public class Immutable {
    private List<String> list;

    public Immutable(String firstValue) {
        this.list = new ArrayList<>();
        this.list.add(firstValue);
    }

    public List<String> getList() {
        return new ArrayList<>(list);
    }


    public static void main(String[] args) {
        Immutable immutable = new Immutable("Bla");
        System.out.println(immutable.getList());
        immutable.getList().add("BLA2");
        System.out.println(immutable.getList());

    }
}
