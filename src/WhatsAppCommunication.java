import java.util.HashSet;
import java.util.Set;

public class WhatsAppCommunication implements CommunicationService{
    private static Set<User> subs = new HashSet<>();
    @Override
    public void communication(User emp) {

    }

    @Override
    public void subscribe(User emp) {
        subs.add(emp);
    }

    @Override
    public void unSubscribe(User emp) {
        subs.remove(emp);
    }

    @Override
    public void SendMessage(User emp1, User emp2) {

    }
}
