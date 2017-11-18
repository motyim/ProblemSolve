package me.motyim.old.MyOwnSolve;

// *****************************************************
// *
// * Programmer 1 : First Last
// * Programmer 1 : First Last (If you were in a team of 2)
// * Date: July XX, 2015
// *
// * Describe all changes made to the code.
// * This may take several lines of comments.
// *
// * Change 1, Refactor Catalogue Description
// * Describe the problem with code that needing fixing.
// * What change(s) did you do?
// *
// * Change 2, Refactor Catalogue Description
// * Describe the problem with code that needing fixing.
// * What change(s) did you do?
// *   :
// *   :  Many more changes in this area
// *   :
// * Change N, Refactor Catalogue Description
// * Describe the problem with code that needing fixing.
// * What change(s) did you do?
// *
// * You may also want to embed comments within the code
// *
// *****************************************************

public class classFirst {

    // Encapsulate the field
    private static String name = "Some Student";

    public static int poorMethodName(int i, int j) {
        return i + j;
    }

    public class lion {

        public String name;
        public String weight;
        public double yearsWithZoo;

    }

    public class bird {

        public String name;
        public double wingSpan;
        public String weight;
        public double yearsWithZoo;

    }

    public class bear {

        public String name;
        public String bearType; // Polar, Kodiak, Brown, Black
        public String weight;
        public double yearsWithZoo;

    }

    public class animal {

        public String animalID;
    }

    public class person {
        // Create any additional gets or sets
        // Revise classes

        private Float employeeSocialSecurityNumber;
        private String employeefirstName;
        private String employeelastName;
        private String employeeaddress;
        private String employeeID;
        public double yearsWithZoo;
        private String jobTitle;
        private double salary;

        public person(String string) {
            // TODO Auto-generated constructor stub
        }

        public person() {
            // TODO Auto-generated constructor stub
        }

        public String getEmployeeFirstName() {
            return employeefirstName;
        }

        public void setEmployeeFirstName(String employeefirstName) {
            this.employeefirstName = employeefirstName;
        }

        public String getemployeelastName() {
            return employeelastName;
        }

        public void setEmployeeLastName(String employeelastName) {
            this.employeelastName = employeelastName;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public double fivePercentBonus(double Salary) {
            // Employees working 0 to 3 years get a 5% bonus
            return salary * 1.05;
        }

        public double tenPercentBonus(double Salary) {
            // Employees working more than 3 years get a 10% bonus
            return salary * 1.1;
        }

        public double ticketSales(double adultTickets, double childTickets) {
            // What is the gross profit for the tickets purchased
            double adultTicketPrice = 8;
            double childTicketPrice = 4;
            double total;
            total = adultTicketPrice * adultTickets + childTicketPrice * childTickets;
            return total;
        }

    }

    public static void main(String[] args) {
	   // ****************************************
        // Houston Zoological Park
        //
        // This program reads three files. 
        //    1) An Animal File
        //    2) An employee file.
        //    3) A customer file.
        //
        // It determines the total number of animals and average wingspan for birds.
        // It calculates the bonus for each employee and prints out the results.
        // It calculates ticket sales.
        //
        // ****************************************

        // Convert local to field variables
        int i;
        i = 3;
        int j;
        j = 4;

        System.out.println(poorMethodName(i, j));
        // ----------------------------------------------
        String person = name;
        System.out.print(person);

    }
}
