package javaSe07;

public class NormalEmployee extends Person {
    public NormalEmployee(String address, String family, int id, String name) {
        super(address, family, id, name);
    }

    @Override
    public String toString() {
        return "NormalEmployee{"
                +super.toString()+ '}';
    }
}
