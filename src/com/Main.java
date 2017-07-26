package com;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 15; i++){
            studentList.add(new Student("Student",  Integer.toString(i + 1), 1));
        }

        List<Teacher> teacherList = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            teacherList.add(new Teacher("Teacher", Integer.toString(i + 1), 1));
        }

        Map<Teacher, Set<Student>> teacherSetMap = new HashMap<>();

        for (int i = 0; i < 3; i++){

            Set<Student> studentSet = new HashSet<>();

            for (int j = 0; j < 5; j++){
                int studentInt = i * 5 + j;
                studentSet.add(studentList.get(studentInt));
            }
            teacherSetMap.put(teacherList.get(i), studentSet);
        }

        System.out.println("teacherSetMap keys");
        for (Teacher t : teacherSetMap.keySet()){
            System.out.print(t);
        }

        System.out.println();

        System.out.println("teacherSetMap values");
        for (Set s : teacherSetMap.values()){
            System.out.print(s);
        }

        System.out.println();

        System.out.println("entrySet()");
        for (Map.Entry<Teacher,Set<Student>> thing : teacherSetMap.entrySet()){
            System.out.println(thing);
        }
    }
}
