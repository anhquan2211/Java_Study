package com.example.exercise01;

public class ScoreManagement implements ManagementUtils {
    //tên
    private String managerName;

    //phương thức để lấy ra tên nhận diện trình quản lý điểm số
    public ScoreManagement(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerName() {
        return managerName;
    }

    //phương thức để cập nhật và in ra điểm số sau khi cập nhật của học sinh
    public void updateAndPrintScore(Student student, double newScore) {
        processing();
        student.setScore(newScore);
        System.out.println("Updated Score: " + student.getScore());
    }

    //ghi đè phương thức processing() dùng để in ra màn hình chuỗi kí tự "Score Management " + hằng số "Processing..."
    @Override
    public void processing() {
        System.out.println("Score Management " + PROCESSING);
    }
}

