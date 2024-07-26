package Exercise04;

import java.util.*;

public class StudentManagement {
    private List<Student> studentList;
    public StudentManagement() {
        studentList = new ArrayList<>();
    }

    public void showAll(){
        if(studentList.isEmpty()){
            System.out.println("Nothing to show");
        }else{
            for(Student student : studentList){
                System.out.println(student);
            }
        }
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void removeStudent(int studentId){
         Student studentToRemove = findStudentById(studentId);
              if(studentToRemove != null){
                  studentList.remove(studentToRemove);
                  System.out.println("Student with student ID: "+studentId+" was removed");
              }else {
                  System.out.println("Student with student ID: "+studentId+" was not found");
              }
        }


    public Student findStudentById(int studentId){
        for(Student student : studentList){
            if(student.getStudentId() == studentId){
                return student;
            }
        }
        System.out.println("Student with student ID: "+studentId+" does not exist");
        return null;
    }

    public double getAverageScore(){
        if(studentList.isEmpty()){
            return 0;
        }
        double totalScore = 0;
        for(Student student : studentList){
            totalScore+= student.getAverageScore();
        }
        return totalScore/studentList.size();
    }

    public void sortByScore(){
        if(studentList.isEmpty()){
            System.out.println("Nothing to show");
        }else {
            Collections.sort(studentList, Comparator.comparing(Student::getAverageScore));
            System.out.println("student list after sorted by score: ");
            showAll();
        }
    }


    }


