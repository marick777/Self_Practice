package day17_ClassAndObjects;

public class Student {

    public String name;
    public char gender;
    public int age;
    public String studentId;
    public int grade;
    public String isFullTime;


    public void setInfo(String name, char gender, int age, String studentId, int grade, String isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", grade=" + grade +
                ", isFullTime='" + isFullTime + '\'' +
                '}';
    }

    public void study(){
        System.out.println("The "+name+" who is "+gender+" of "+age+" with student ID "+studentId+" and grade "+grade+" is "+
                isFullTime+" student.");
    }
}

/*
Create a custom class named Student
		Attributes:
			name, gender, age, studentId, grade, isFullTime

		Actions:
			setInfo(): sets all the fields of the student object
			toString(): when a car object is passed in print statement,
					it should display all the information of the student object
			study()
 */
