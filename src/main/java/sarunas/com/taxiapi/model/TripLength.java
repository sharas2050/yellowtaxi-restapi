package sarunas.com.taxiapi.model;

import javax.persistence.*;

@Entity
public class TripLength {

    @Id
    @Column(name = "total")
    private String total;
    @Column(name = "average")
    private String average;
    @Column(name = "median")
    private String median;

    public TripLength(String total, String average, String median) {
        this.total = total;
        this.average = average;
        this.median = median;
    }

    public TripLength() {
    }

    public String getTotal() {
        return total;
    }

    public String getAvg() {
        return average;
    }

    public String getMedian() {
        return median;
    }
}

