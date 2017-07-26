package com;

public class Teacher extends Student {

    private static int lastTeacherID = 1;

    public Teacher(String firstName, String lastName, int grade) {
        super(firstName, lastName, grade);
        setId(lastTeacherID);
        lastTeacherID++;
    }

    @Override
    public String toString() {
        return "Teacher = {" +
            "firstName = '" + firstName + '\'' +
            "lastName = '" + lastName + '\'' +
            "id = " + id +
            "grade = " + grade +
            "}\n";
    }
}
