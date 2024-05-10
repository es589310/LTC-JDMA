package Lesson20.Mentor.Exercises;

public class Customer {
    String name;
    boolean isSending;

    public Customer(String name, boolean isSending) {
        this.name = name;
        this.isSending = isSending;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSending() {
        return isSending;
    }

    public void setSending(boolean sending) {
        isSending = sending;
    }
}
