package day29_inheritence.employeeTask;

public class employees {
    private String name;
    private char gender;
    private int age;
    private String id;
    private String jobTitle;
    private double salary;

    public void setInfo(String name, char gender, int age, String id, String jobTitle, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender=='M' || gender=='F'){
            this.gender = gender;
        }else{
            System.err.println("Invalid gender, only 'M' or 'F'");
            System.exit(1);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("Age can not be negative");
            System.exit(1);
        }
        if(age>18 && age<65){
            this.age = age;
        }else {
            System.err.println("age MUST be between 18 to 65");
            System.exit(1);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("salary can not be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void testing(){
        System.out.println(name+" is testing");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

