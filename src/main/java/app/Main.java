package app;

public class Main {
    public static void main(String[] args) {
        User user = new User("John Doe");

        Address userAddress = new Address("Street 1", "City");

        user.setAddress(userAddress);
        System.out.println(user.getAddress().toString());
    }
}
