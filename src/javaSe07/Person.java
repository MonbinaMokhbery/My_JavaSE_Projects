package javaSe07;

import com.sun.jnlp.FileSaveServiceImpl;

public class Person {
    private String name;
    private String family;
    private int Id;
    private String  address;

    public Person(String address, String family, int id, String name) {
        this.address = address;
        this.family = family;
        Id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", Id=" + Id;
    }


}
