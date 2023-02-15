import java.util.HashSet;
import java.util.Set;

public class CallCommunication implements CommunicationService{
    private static Set<User> subs = new HashSet<>();
    @Override
    public void communication(User emp) {

    }

    @Override
    public void subscribe(User user) {
        subs.add(user);
    }

    @Override
    public void unSubscribe(User user) {
        subs.remove(user);
    }

    @Override
    public void SendMessage(User user1, User user2) {

    }
}
