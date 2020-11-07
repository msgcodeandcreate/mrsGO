package de.mrsgo.backend.backend;

public class ChatMessage {

    private String content;
    private String sender;
    private MessageType type;

    public enum MessageType { CHAT, LEAVE, JOIN }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return this.sender;
    }

    public void setMessageType(MessageType type) {
        this.type = type;
    }

    public MessageType getMessageType() {
        return this.type;
    }

}


