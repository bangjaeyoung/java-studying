package ch02;

public class Student implements Cloneable{

    private int number;
    private String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String toString() {
        return number + ", " + name;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Student) {
            Student std = (Student)obj;
            if(this.number == std.number)
                return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
