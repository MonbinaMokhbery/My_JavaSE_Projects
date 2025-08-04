package JavaSe07;

public class SingleCustomer extends Person {
    private int number;

    public SingleCustomer(String address, String family, int id, String name, int number) {
        super(address, family, id, name);

        this.number = number;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "SingleCustomer{" +
                super.toString()+
                ", number=" + number +
                '}';
    }
}
