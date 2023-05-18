package com.example.schoolmanagementsystem;

//This class is responsible for keeping the track of students fees,names,grades,fees paid
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;
    /* to create a new student by initializing.
    Fees for every student is $30000 annually
    Fees paid initially is 0.
    * @param id for unique student id
    * @param name for name of the student
    * @param grade for grade of the student */

    public Student(int id, String name, int grade){
      this.feesPaid = 0;
      this.feesTotal = 30000;
      this.id = id;
      this.name = name;
      this.grade = grade;
    }

    //Not going to alter students' names, ids
    /*used to update students grade
    * @param grade new grade of student */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /*Add the fees to the fees paid field
    The school is going to receive the funds.
    @param fees fees that the student pays.*/
    public void payFees(int fees) {
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getname() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name : " +name+ " Total fees paid so far: $" + feesPaid;
    }
}
