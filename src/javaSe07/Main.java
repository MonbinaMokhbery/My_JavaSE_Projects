package JavaSe07;

public class Main {
    public static void main(String[] args) {
        NormalEmployee normalemployee = new NormalEmployee("tehran","rad",12345,"maryam");

        System.out.println(normalemployee);

        OfficeEmployee officeemployee = new OfficeEmployee("tehran","rad",12345,"maryam","normal");

        System.out.println(officeemployee);

        FinancialEmployee financialemployee = new FinancialEmployee("tehran","rad",12345,"maryam",20);

        System.out.println(financialemployee);

        FinancialFundEmployee financialfundemployee = new FinancialFundEmployee("tehran","rad",12345,"maryam",870);

        System.out.println(financialfundemployee);

        MajorCustomer majorcustomer = new MajorCustomer("tehran","rad",12345,"maryam",2558,32521);

        System.out.println(majorcustomer);

        SingleCustomer singlecustomer = new SingleCustomer("tehran","rad",12345,"maryam",25861);
        
        System.out.println(singlecustomer);

    }
}
