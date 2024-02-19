package HWSeminar5.service;

import HWSeminar5.model.StudyGroup;
import HWSeminar5.model.Student;
import HWSeminar5.model.Teacher;

import java.util.ArrayList;


public class GroupService {

    public StudyGroup CreateGroup(Integer num, Teacher teacher, Student... students) {
        ArrayList<Student> listStudents = new ArrayList<>();
        for (Student student : students) {
            listStudents.add(student);
        }
        return new StudyGroup(num, teacher, listStudents);
    }
}