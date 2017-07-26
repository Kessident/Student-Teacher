package com;

public class Student {
    String firstName;
    String lastName;
    int id;
    int grade;
    private static int lastStudentID = 1;

    public Student() {
    }

    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        id = lastStudentID;
        lastStudentID++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    protected void setId(int newID){
        this.id = newID;
    }

    @Override
    public String toString() {
        return "\nStudent = {" +
            "firstName = '" + firstName + '\'' +
            "lastName = '" + lastName + '\'' +
            "id = " + id +
            "grade = " + grade +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (grade != student.grade) return false;
        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
        return lastName != null ? lastName.equals(student.lastName) : student.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + grade;
        return result;
    }
}