package JavaSe07;

public class FinancialFundEmployee extends Person {
    private int credit;

    public FinancialFundEmployee(String address, String family, int id, String name, int credit) {
        super(address, family, id, name);
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "FinancialFundEmployee{"
                +super.toString()+
                "credit=" + credit +
                '}';
    }
}
