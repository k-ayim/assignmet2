package models;

public class Student extends Person {
    private Double gpa;

    public Student() {
        super();
        setGpa(0d);
    }

    public Student(String name, String surname, Double gpa) {
        super(name, surname);
        setGpa(gpa);
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) return 36660;
        return 0;
    }

    @Override
    public String toString() {
        return getPosition() + ": " + super.toString();
    }
}

