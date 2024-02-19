package HWSeminar5.model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private Integer numberGroup;
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(Integer numberGroup, Teacher teacher, ArrayList<Student> students) {
        this.numberGroup = numberGroup;
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Номер группы - " + numberGroup +
                ", преподаватель группы - " + teacher +
                ", студeнты группы - " + students +
                '}';
    }
}