package rosonatt;

public class User {

    private String firstName;
    private String lastName;

    // SETTER
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    // GETTER
    public String getFirstName() {
        return firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}

