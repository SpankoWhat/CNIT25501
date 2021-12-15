package amazbay;
import java.util.*;

public class Website
{
    private ArrayList<Person> users;
    private ArrayList<Message> msg;
    private ArrayList<Message> userMsg;

    public Website()
    {
        users = new ArrayList<>();
        msg = new ArrayList<>();
        userMsg = new ArrayList<>();       
    }

    public void addPerson(Person p)
    {
        users.add(p);
    }

    public Person getPersonByUID(int uid)
    {
        for(Person human:users){
            if (human.getUID() == uid){
                return human;
            }
        }
        return null;
    }

    void addMessage(Message m)
    {
        msg.add(m);
    }

    public Message[] getMessagesFor(int uid)
    {
        Message[] list;
        userMsg.clear();
        
        for(Message text:msg){
            if((text.getReceiver().getUID() == getPersonByUID(uid).getUID())||
                    (text.getSender().getUID() == getPersonByUID(uid).getUID())){
                userMsg.add(text);
            }
        }
        list = new Message[userMsg.size()];
        
        for(int i = 0; i < userMsg.size(); i++){
            list[i] = userMsg.get(i);
        }
        
        return list;
    }
}
