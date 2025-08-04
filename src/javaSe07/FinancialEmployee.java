package JavaSe07;

public class FinancialEmployee extends Person {
    private int category;

    public FinancialEmployee(String address, String family, int id, String name, int category) {
        super(address, family, id, name);
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FinancialEmployee{" +
                super.toString()+
                "category=" + category +
                '}';
    }
}
