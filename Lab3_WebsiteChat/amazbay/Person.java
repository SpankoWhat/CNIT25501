package amazbay;

public class Person
{ 
    private String firstName;
    private String lastName;
    private int uid;

    public Person(int uid, String firstName, String lastName)
    {
        setUID(uid);
        setFirstName(firstName);
        setLastName(lastName);
    }

    //setters
    public void setUID(int uid)
    {
        this.uid = uid;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    //getters
    public int getUID()
    {
        return uid;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getFullName()
    {
        return firstName + " " + lastName;
    }


    public void sendMessageTo(Person receiver, String message, long when,
                              Website website)
    {
        Message m = new Message(this, receiver, message, when);
        website.addMessage(m);
    }

}
