package refactor;

/***
 *  Extract a variable.
 * Sometimes certain expressions are repeated so often in code that you'll want to move them into a separate variable.
 */
public class Example5 {
    public static void main(String[] args) {
 new Example5().printInfo(new User());
    }

    public void printInfo(User user) {
        System.out.println(user.getProfile().getName());
        System.out.println(user.getProfile().getAddress().getState());
        System.out.println(user.getProfile().getAddress().getCity());
        System.out.println(user.getProfile().getAddress().getStreet());
        System.out.println(user.getProfile().getAddress().getHomeNumber());
    }
}

class User {

    Profile profile;

    public Profile getProfile() {
        return profile;
    }
}

class Profile {
    String name;
    Address address;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

class Address {
    String state;
    String city;
    String street;
    String homeNumber;

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }
}








/****
 * ***** Hint ****
 * instead of user.getProfile() pull it to a variable
 * same for user.getProfile().getAddress()
 * ****/