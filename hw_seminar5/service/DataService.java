package HWSeminar5.service;

import HWSeminar5.model.User;
import java.util.List;

public interface DataService<User> {
    User create(User user);
    List<User> read();
}