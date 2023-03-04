package day17_ClassAndObjects;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;


    public void setInfo(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String toString() {
        return "\nItem{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +'\n'+
                "Total price of "+name+" in quantity of "+quantity+" pieces is $"+(unitPrice*quantity)+
                '}';
    }

    public void calcCoast(){
        System.out.println("Total price of "+name+" in quantity of "+quantity+" pieces is $"+(unitPrice*quantity));
    }
}
/*
Create a class called Item
    Attributes:
        name, unitPrice, quantity

    Actions:
    	setInfo(): sets all the fields of Item object
        calcCost(): returns the total price of the Item
        toString(): when a SalaryCalculator object is passed in print statement,
        it should display the full information of the item object
 */