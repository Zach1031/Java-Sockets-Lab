package day7;

public class MessageDM_Chat extends Message {
    public String userName;
    public String msg;

    public MessageDM_Chat(String line) {
        this.userName = line.substring(line.indexOf("@")+1,line.indexOf(" "));
        this.msg = line.substring(line.indexOf(" ")+1);
    }

    public String toString() {
        return "Chat Message to " + userName + ": " + msg;
    }
}