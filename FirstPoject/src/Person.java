public class Person {
    String firstName;
    String lastName;
    String occupation;
    int age;
    double weight;
    char gender ;

    public Person(){

    }

    public int getAge(int age){
        return age;
    }

    public void setName(String firstName, String lastName){
        System.out.println("First name off the person is: " +firstName+ " and last name is: " + lastName);
    }
    public String getOccupation(){
        return "work";
    }

    public int method4(char gender){
        return gender;
    }
}
