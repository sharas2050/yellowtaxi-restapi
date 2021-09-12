package sarunas.com.taxiapi.model;

import javax.persistence.*;

@Entity
public class Counter {

    @Id
    @Column(name = "ccount")
    private String ccount;

    public Counter(String ccount) {
        this.ccount = ccount;
    }

    public Counter() {
    }

    public String getCcount() {
        return ccount;
    }
}

