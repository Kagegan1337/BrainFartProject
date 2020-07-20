package Object;

public class Foo {
    private String name;
    private int count;

    public Foo(String name) {
        this.name = name;
        this.count = 0;
    }

    public void increment() {
        count += 1;
    }

    public int getCount() {
        return count;
    }
}
