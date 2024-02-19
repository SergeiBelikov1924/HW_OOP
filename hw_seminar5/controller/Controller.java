package HWSeminar5.controller;

import HWSeminar5.model.StudyGroup;
import HWSeminar5.model.Student;
import HWSeminar5.model.Teacher;
import HWSeminar5.model.User;
import HWSeminar5.service.GroupService;
import HWSeminar5.service.UserService;
import HWSeminar5.view.StudentView;

import java.util.List;

public class Controller {
    private UserService userService;
    private GroupService groupService;
    private StudentView studentView;

    public Controller() {
        this.userService = new UserService();
        this.studentView = new StudentView();
        this.groupService = new GroupService();
    }

    public Student createStudent(Student student) {
        return (Student) userService.create(student);
    }

    public Teacher createTeacher(Teacher teacher) {
        return (Teacher) userService.create(teacher);
    }

    public StudyGroup createGroup(Integer num, Teacher teacher, Student... students) {
        return groupService.CreateGroup(num, teacher, students);
    }

    public void printStudents(Student student) {
        studentView.printStudent(student);
    }

    public List<User> returnStudents() {
        return userService.read();
    }
}