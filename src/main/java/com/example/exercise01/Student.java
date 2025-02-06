package com.example.exercise01;

public class Student {
    //tên
    private String name;
    //tuổi
    private int age;
    //điểm số
    private double score;

    //các phương thức để lấy và cập nhật lại các thuộc tính trên
    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
