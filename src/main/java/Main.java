import com.isa.usersengine.dao.UsersRepositoryDao;
import com.isa.usersengine.dao.UsersRepositoryDaoBean;
import com.isa.usersengine.domain.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        UsersRepositoryDao usersRepositoryDao = new UsersRepositoryDaoBean();
        for( User user : new UsersRepositoryDaoBean().getUsersList()) {
            System.out.println(user.getName());
        }

        System.out.println(usersRepositoryDao.getUsersList());
    }
}
