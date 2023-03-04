package day18_GarbageCollection;

public class Contact {

    public String name, email;
    public int phoneNumber;

    public void setInfo(String name, String email, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public String call(){
        return "Calling "+name+" now!";

    }

    public  String sendMessage(){

        return "Sending message to "+phoneNumber+" now";


    }

    public String sendEmail(){

        return "Sending email to "+email+" now";

    }

}
/*
Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"
 */
