package day7;

public class MessageDM_Chat extends Message {
    public String senderName;
    public String recieverName;
    public String msg;

    public MessageDM_Chat(String sender, String line) {
        this.senderName = sender;
        this.recieverName = line.substring(line.indexOf("@")+1,line.indexOf(" "));
        this.msg = line.substring(line.indexOf(" ")+1);
    }

    public String toString() {
        return "Chat Message to " + recieverName + " from " + senderName + ": " + msg;
    }
}