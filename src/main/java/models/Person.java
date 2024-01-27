package models;

public abstract class Person implements IPayable {
    private static Long idCounter = 0L;
    private final Long id = ++idCounter;
    private String name;
    private String surname;


    public Person() {
        setName("Anon");
        setSurname("Anonymous");
    }

    public Person(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public String getPosition() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
