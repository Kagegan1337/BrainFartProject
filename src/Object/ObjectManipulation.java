package Object;

import java.util.ArrayList;
import java.util.List;

public class ObjectManipulation {

    public static void main(String[] args) {
        List<Foo> t = new ArrayList<>();
        Foo f = new Foo("foo");
        t.add(f);
        f.increment();
        t.add(f);
        for(Foo a : t) {
            System.out.println(a.getCount());
        }
    }
}
