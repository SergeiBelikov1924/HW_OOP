package HWSeminar5.service;

import HWSeminar5.model.Student;
import HWSeminar5.model.Teacher;
import HWSeminar5.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {
    List<User> listUser;

    public UserService() {
        this.listUser = new ArrayList<>();
    }

    @Override
    public User create(User user) {
        if (user instanceof Student) {
            int id = maxStudentId();
            listUser.add(new Student(user.getName(), user.getSecondName(), user.getYear(), id));
        } else {
            int id = maxTeacherId();
            listUser.add(new Teacher(user.getName(), user.getSecondName(), user.getYear(), id));
        }

        return listUser.get(listUser.size()-1);
    }

    private int maxStudentId() {
        for (int i = listUser.size() - 1; i > -1; i--) {
            if (listUser.get(i) instanceof Student) {
                return i+1;
            }
        }
        return 0;
    }

    private int maxTeacherId() {
        for (int i = listUser.size() -1; i > -1; i--) {
            if (listUser.get(i) instanceof Teacher) {
                return i+1;
            }
        }
        return 0;
    }

    @Override
    public List<User> read() {
        return listUser;
    }

    @Override
    public Object create(Object user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }
}