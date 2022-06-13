package interface_class_abstraites;

public class Test {
}


interface CanWriteCode{
    void writeCode();
}

abstract class Employee{
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
class Developer extends  Employee implements CanWriteCode{
    private String[] languages;

    public Developer(String firstName, String lastName, String[] languages) {
        super(firstName,lastName);
        this.languages = languages;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public void writeCode() {
        System.out.println("J'ecris du code");
    }

}

class Tester extends Employee implements CanWriteCode{
    private String[] testingFramwork;

    public Tester(String firstName, String lastName, String[] testingFramwork) {
        super(firstName,lastName);
        this.testingFramwork = testingFramwork;
    }


    public String[] getTestingFramwork() {
        return testingFramwork;
    }

    public void setTestingFramwork(String[] testingFramwork) {
        this.testingFramwork = testingFramwork;
    }

    @Override
    public void writeCode() {
        System.out.println("J'ecris des tests");
    }

//    public void writeCode(){
//        System.out.println("J'ecris des tests");
//    }
}


class Meeting{
    public void makeStandupMeeting(CanWriteCode canWriteCode){

    }
}

class Main{
    public static void main(String[] args) {
        Developer marcos=new Developer("Marcos","Musafiri", new String[]{"Java", "C++", "Python"});
        Tester chris=new Tester("Christian","Lisangola",new String[]{"Jest","React Testing Library","Junit5"});
    }
}