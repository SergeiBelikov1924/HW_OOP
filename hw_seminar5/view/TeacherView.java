package HWSeminar5.view;

import HWSeminar5.model.Teacher;
import java.util.List;


public class TeacherView {
    public void printListTeachers(List<Teacher> listTeachers) {
        System.out.println("Все преподаватели: ");
        for (Teacher teacher : listTeachers) {
            System.out.println(teacher);
        }
        System.out.println();
    }
}