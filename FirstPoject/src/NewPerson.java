public class NewPerson {
    public static void main(String[] args) {
        Person myPerson = new Person();
        myPerson.firstName = "Dumitru";
        myPerson.lastName = "Stratila";
        myPerson.occupation = myPerson.getOccupation();
        myPerson.age = 24;
        myPerson.gender = 'M';


        myPerson.getAge(myPerson.age);
        {
            System.out.println("The age of th person is: " +myPerson.age);
        }

        myPerson.setName(myPerson.firstName, myPerson.lastName);

        myPerson.getOccupation();
        System.out.println("It's occupation is: "+ myPerson.occupation);

        System.out.println("Gender converted in int is: "+myPerson.method4('M'));











        }
    }

