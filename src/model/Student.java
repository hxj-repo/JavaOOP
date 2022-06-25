package model;

public class Student {
    private String name;
    private byte age;
    private char gender;
    private Long IDNo;

    public Student(String name, byte age, char gender, Long IDNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.IDNo = IDNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Long getIDNo() {
        return IDNo;
    }

    public void setIDNo(Long IDNo) {
        this.IDNo = IDNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", IDNo=" + IDNo +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Student student = new Student("张三", (byte) 18, '男', 20180101L);
        System.out.println(student);
    }
}