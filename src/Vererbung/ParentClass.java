package Vererbung;

public class ParentClass {

    public String name;
    private String lastname;

    public ParentClass(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    private String getLastname() {
        return lastname;
    }
}
