//записали свойства как переменные здесь
//wrote out the properties as variables here

import java.util.Scanner;

//мы не хотим, чтобы люди действительно получали к нему прямой доступ, а затем сделали его закрытым
//we don`t want to people actually access it directly then made it private
public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

    //конструктор для получения имени и фамилии
    //constructor to receive the first and the last name

    public Email(String firstName, String lastName) {
        this.firstName = firstName; //this refers to the class of a variable
        this.lastName = lastName;   // and then we would say equals name that`s going to refer
//        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);


        //вызвать метод для отдела - вернуть отдел
        //call the method for the department - return the department
        this.department = setDepartment();//class variable Department which is private = State Department
//        System.out.println("Departments: " + this.department);

        //call the methode that`s returns a random password
        this.password = randomPassword(8);
//        System.out.println("Your password: " + this.password);

        //combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
//        System.out.println("Your email is: " + email);


    }


    //ask for the department
    private String setDepartment() {
        System.out.print("New worker: " + firstName + ". Departments Codes:\n1 for Sales\n2 for Development\n3 for the Accounting\n0 for none ENTER THE DEPARTMENT CODE:");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();//they're going to enter either 0 or 1 to 2
        if (deptChoice == 1) {
            return "sales";
        } else if (deptChoice == 2) {
            return "dev";
        } else if (deptChoice == 3) {
            return "acct";
        } else {
            return " ";
        }
    }


    //generate the random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHKLMNOPQRSTUVWXYZ1234567890@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";

    }
}

