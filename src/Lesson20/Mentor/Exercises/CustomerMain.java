package Lesson20.Mentor.Exercises;

import java.util.LinkedList;

public class CustomerMain {
    public static void main(String[] args) {
        LinkedList<String> senders = new LinkedList<>();
        LinkedList<Boolean> receivers = new LinkedList<>();

        Customer sender1 = new Customer("Arif Quliyev",true);
        Customer sender2 = new Customer("Paşa İbrahimov", false);


//        private static void addToAppropriateList(Customer customer, LinkedList<String> senders, LinkedList<String> receivers) {
//            if (customer.isSending()) {
//                senders.add(customer.getName());
//            } else {
//                receivers.add(customer.getName());
//            }
    }
}
