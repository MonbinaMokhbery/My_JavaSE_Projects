package JavaSe07;

public class MajorCustomer extends Person {
    private int number;
    private int banknumber;

    public MajorCustomer(String address, String family, int id, String name, int banknumber, int number) {
        super(address, family, id, name);
        this.banknumber = banknumber;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBanknumber() {
        return banknumber;
    }

    public void setBanknumber(int banknumber) {
        this.banknumber = banknumber;
    }

    @Override
    public String toString() {
        return "MajorCustomer{" +
                super.toString()+
                "banknumber=" + banknumber +
                ", number=" + number +
                '}';
    }
}
