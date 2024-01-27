package models;

public class Employee extends Person {
    private String position;
    private Double salary;

    public Employee() {
        super();
        setSalary(0d);
    }

    public Employee(String name, String surname, String position, Double salary) {
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    @Override
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public String toString() {
        return super.getPosition() + ": " + super.toString();
    }
}
