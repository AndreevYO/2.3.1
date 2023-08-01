package web.Dao;

import web.Models.User;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface UserDao {
    public List<User> getAllUsers();

    public User getUserById(int id);

    public void save(User user);

    public void update(int id, User updateUser);

    public void delete(int id);
}
