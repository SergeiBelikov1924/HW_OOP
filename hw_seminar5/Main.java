package HWSeminar5;

import HWSeminar5.controller.Controller;
import HWSeminar5.model.StudyGroup;
import HWSeminar5.model.Student;
import HWSeminar5.model.Teacher;

public class Main {
    public static void main(String[] args) {
        Controller controller =  new Controller();
        Student student = controller.createStudent(new Student("Владимир", "Корочкин", 1982));
        Student student2 = controller.createStudent(new Student("Андрей", "Бушманов", 1992));
        Student student3 = controller.createStudent(new Student("Василий", "Михалыч", 1990));
        Student student4 = controller.createStudent(new Student("Николай", "Горохов", 1980));
        Teacher teacher = controller.createTeacher(new Teacher("Алефтина", "Николаевна", 1970));
        Teacher teacher2 = controller.createTeacher(new Teacher("Валентина", "Фролова", 1950));
        StudyGroup group456 = controller.createGroup(456, teacher, student, student2);
        StudyGroup group211 = controller.createGroup(211, teacher2, student3, student4);
        System.out.println(group456.toString());
        System.out.println(group211.toString());

//        controller.printStudents(student);
//        System.out.println(controller.returnStudents());
    }
}