package Exercise04;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudent(new Student(1,"Bob",9.5));
        studentManagement.addStudent(new Student(2,"Alice",8.5));
        studentManagement.addStudent(new Student(3,"Bobby",9.2));

        System.out.println("Student List: ");
        studentManagement.showAll();

        System.out.println("Average Score of all students: "+studentManagement.getAverageScore());

        studentManagement.sortByScore();

        System.out.println("Find student by ID 2: "+studentManagement.findStudentById(2));

        studentManagement.removeStudent(1);

        System.out.println("Student List after removal: ");
        studentManagement.showAll();

    }
}
