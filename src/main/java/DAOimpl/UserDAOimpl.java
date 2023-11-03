package DAOimpl;

import DAO.UserDao;
import Model.Student;
import Model.User;
import java.util.List;

public class UserDAOimpl implements UserDao {

    @Override
    public User getById(List<User> lu, Long userId) {
        for (User user : lu) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void insert(List<User> lu, User u) { lu.add(u); }

    @Override
    public void delete(List<User> lu, User u) { lu.remove(u); }

}
