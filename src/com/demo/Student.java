package com.demo;

public class Student {

    private int studentId;
    protected int studentAge;
    public String studentGrade;
    String studentName ;

//     public Student(){
//      System.out.println("No argument constructor");
//     }

     public Student(int studentId, int studentAge, String studentGrade, String studentName){
         System.out.println("inside parametraized constructor");
         this.studentId = studentId;
         this.studentAge = studentAge;
         this.studentGrade = studentGrade;
         this.studentName = studentName;
     }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentAge=" + studentAge +
                ", studentGrade='" + studentGrade + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    public static void main(String args[]) {
        Student student1 = new Student(1,20,"A","Subh kamal") ;
        Student student2 = new Student(2,19,"A","Iyana");
        Student student3 = new Student(3,21,"B","Anuj");
        Student student4 = new Student(4,23,"C","Deepak");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

    }
}