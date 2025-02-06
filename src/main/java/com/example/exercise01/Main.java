package com.example.exercise01;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement("Student Manager");
        ScoreManagement scoreManagement = new ScoreManagement("Score Manager");

        // In ra tên nhận diện của 2 trình quản lý điểm số và học sinh
        System.out.println("Manager Name: " + studentManagement.getManagerName());
        System.out.println("Manager Name: " + scoreManagement.getManagerName());

        // Tạo một đối tượng học sinh và in ra được thông tin tên, tuổi, điểm số ban đầu thông qua trình quản lý học sinh
        Student student = new Student("Luu Anh Quan", 24, 100);
        studentManagement.printStudentInfo(student);

        // Cập nhật điểm số mới cho chính đối tượng học sinh đó và in ra điểm số mới thông qua trình quản lý điểm số
        scoreManagement.updateAndPrintScore(student, 83.86);
    }
}

