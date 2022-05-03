package Chap7;

public class GradeBook {
    private String courseName;
    private int[] grades;

    public GradeBook(String courseName, int[] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void processGrades(){

    }
    public double getAverage(){
        int total = 0;

        for (int grade : grades)
            total += grade;

        return (double) total / grades.length;
    }
    public void outputGrades(){
        System.out.printf("The grades are:%n%n");

        for (int student = 0; student < grades.length; student++){
            System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
        }
    }
}
