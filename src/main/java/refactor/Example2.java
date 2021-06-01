package refactor;

/***
 * Extract a class
 * If A class performs too many functions. Some of them must be moved to another class.
 * **/

public class Example2 {
    public static void main(String[] args) {
        var human = new Human();
    }
}

class Human {
    private String name;
    private String age;
    private String country;
    private String city;
    private String street;
    private String house;
    private String quarter;

    public Human() {
    }

    public Human(String name, String age, String country, String city, String street, String house, String quarter) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.quarter = quarter;
    }

    protected String getFullAddress() {
        return country + ", " + city + ", " + street + ", " + house + " " + quarter;
    }

}











/***
 * ***** Hint ****
 * Move the fields (country, city, street, house, quarter) and method logic getFullAddress() to a new class called Address .
 * ***/