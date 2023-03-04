package day29_inheritence.employeeTask;

public class TestEmployee {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        Developer developer = new Developer();
        Driver driver = new Driver();
        Tester tester = new Tester();

        developer.setInfo("Grisha", 'M', 28, "P412", "Developer", 140000, "Java");

        teacher.setInfo("Vivian",'F', 33,"T456", "Teacher", 130000);

        driver.setInfo("Vika", 'F', 27, "D789", "Driver", 110000);

        tester.setInfo("Josh", 'M', 24, "I456", "Tester", 120000);


        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);

        teacher.teaching();
        developer.coding();
        driver.driving();
        tester.testing();
    }
}
