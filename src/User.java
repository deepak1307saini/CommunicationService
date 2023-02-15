import java.util.Map;

public class User {
    private String name;

    private CommunicationService commChanel;
    private Map<String,CommunicationService> CommServices;

    public User(String name) {
        this.name = name;

    }



}
