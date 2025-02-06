package com.example.exercise01;

public class StudentManagement implements ManagementUtils {
    //có thuộc tính tên để nhận diện đây là trình quản lý học sinh
    private String managerName;

    //phương thức để lấy ra tên nhận diện trình quản lý học sinh
    public StudentManagement(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerName() {
        return managerName;
    }

    //phương thức để in ra thông tin tên, tuổi, điểm số của học sinh
    public void printStudentInfo(Student student) {
        processing();
        System.out.println("Student Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Score: " + student.getScore());
    }

    //ghi đè phương thức processing() dùng để in ra màn hình chuỗi kí tự "Student Management " + hằng số "Processing..."
    @Override
    public void processing() {
        System.out.println("Student Management " + PROCESSING);
    }
}

