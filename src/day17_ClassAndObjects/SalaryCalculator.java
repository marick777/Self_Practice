package day17_ClassAndObjects;

public class SalaryCalculator {

    public double hourlyRate;
    public int weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;

    public void setInfo(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }


    public String toString() {
        return "SalaryCalculator{" +
                "Salary = " + (hourlyRate * weeklyHours * 52) +
                ", State Tax = " + ((hourlyRate * weeklyHours * 52) * stateTaxRate / 100) +
                ", Federal Tax = " + ((hourlyRate * weeklyHours * 52) * federalTaxRate / 100) +
                ", Salary after Tax = " + ((hourlyRate * weeklyHours * 52)-
                (((hourlyRate * weeklyHours * 52) * stateTaxRate / 100)+
                        (hourlyRate * weeklyHours * 52) * federalTaxRate / 100)) +
                '}';
    }

    public void salary() {
        System.out.println("Salary is: " + (hourlyRate * weeklyHours * 52));
    }



    public void stateTax() {
        System.out.println("State tax is: " + ((hourlyRate * weeklyHours * 52) * stateTaxRate / 100));
    }

    public void federalTax() {
        System.out.println("Federal Tax is: " + ((hourlyRate * weeklyHours * 52) * federalTaxRate / 100));
    }
    public void salaryAfterTax(){
        System.out.println("Salary after Tax is: "+((hourlyRate * weeklyHours * 52)-
                (((hourlyRate * weeklyHours * 52) * stateTaxRate / 100)+
                (hourlyRate * weeklyHours * 52) * federalTaxRate / 100)));
    }
}
/*
Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage, you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */