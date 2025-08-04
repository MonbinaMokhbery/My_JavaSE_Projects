package javaSe07;

public class OfficeEmployee extends Person{
    private String accesslevel;

    public OfficeEmployee(String address, String family, int id, String name, String accesslevel) {
        super(address, family, id, name);
        this.accesslevel = accesslevel;
    }

    public String getAccesslevel() {
        return accesslevel;
    }

    public void setAccesslevel(String accesslevel) {
        this.accesslevel = accesslevel;
    }

    @Override
    public String toString() {
        return "OfficeEmployee{"
                + super.toString()+
                "accesslevel=" + accesslevel +
                '}';
    }
}
