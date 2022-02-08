import Data.DB;
import Data.Postgres.Postgres;
import Models.User;
import Repositories.EntityRepository;
import Repositories.users.UserRepository;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        DB db = new Postgres();
        EntityRepository<User> userRepo = new UserRepository(db);

        List<User> users = userRepo.getAll();

        for (User user: users ) {
            System.out.println(user);
        }

        System.out.println("+++++++++++++++++++++++++");
        System.out.println("Select id: ");
        int id = sc.nextInt();

        User user =userRepo.get(id);

        if (user==null) {
            System.out.println("User with id = " + id + " doesn't exist!");
        }
        else
            System.out.println(user);

        db.close();
    }
}
