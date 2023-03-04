package day17_ClassAndObjects;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("John", 'M', 33, "QA123", 86, "Full time");
        Student student2 = new Student();
        student2.setInfo("Vivian", 'F', 26, "A136", 93, "Part time");
        Student student3 = new Student();
        student3.setInfo("Bob", 'M', 41, "XZ893", 77, "Full time");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println();
        student2.study();
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