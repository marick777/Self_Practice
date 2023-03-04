package day29_inheritence.employeeTask;

public class Developer extends employees {

    private String programmingLanguage;


    public void setInfo(String name, char gender, int age, String id, String jobTitle, double salary, String programmingLanguage) {
        setInfo(name, gender, age, id, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        if (programmingLanguage.equalsIgnoreCase("Java") ||
                programmingLanguage.equalsIgnoreCase("JavaScript") ||
                programmingLanguage.equalsIgnoreCase("Python") ||
                programmingLanguage.equalsIgnoreCase("Rubi") ||
                programmingLanguage.equalsIgnoreCase("C#") ||
                programmingLanguage.equalsIgnoreCase("C++") ||
                programmingLanguage.equalsIgnoreCase("Swift")) {
            this.programmingLanguage = programmingLanguage;

        } else {
            System.err.println("Invalid programming language");
            System.exit(1);
        }
    }

        public void coding (){
            System.out.println(getName()+" is codding");
        }

    }


/*
Create a custom Class named Developer

			Variables:
				name, gender, age, id, jobTitle, salary, programmingLanguage

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 to 65
					4. salary can not be negative
					5. programming language can only be set to one of the followings:
						{"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}

			Methods:
				setInfo(): sets all the fields (including programmingLanguage)
				coding()
				toString(): prints developer object info when the object is passed in the print statement
 */
