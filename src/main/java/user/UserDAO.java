package user;



import java.util.List;

public interface UserDAO {
    public void add(User user);
    public List<User> getAll();
    public User getById(int id);
    public void updateById(int id, User update);
    public void deleteById(int id);
}
