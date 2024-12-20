package ROSONATT;

public class User {

    public String setfirstName;
    public boolean getFirstName;

    public static void main(String[] args) {

        String firstName;
        String LastName;


        //SETTER
       public void setFirstName(String firstName){
            this.firstName = firstName.toUpperCase();

        }
        //GETTER
        public String getFirstName(){
           return firstName;

        }
    }
}
