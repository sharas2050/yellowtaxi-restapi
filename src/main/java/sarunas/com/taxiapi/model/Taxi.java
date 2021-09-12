package sarunas.com.taxiapi.model;

import javax.persistence.*;

@Entity
@Table(name = "tripdata")
public class Taxi {

    @Id
    @Column(name = "tpep_pickup_datetime")
    private String tpep_pickup_datetime;
    @Column(name = "tpep_dropoff_datetime")
    private String tpep_dropoff_datetime;
    @Column(name = "passenger_count")
    private String passenger_count;
    @Column(name = "RatecodeID")
    private String RatecodeID;
    @Column(name = "store_and_fwd_flag")
    private String store_and_fwd_flag;
    @Column(name = "PULocationID")
    private String PULocationID;
    @Column(name = "DOLocationID")
    private String DOLocationID;
    @Column(name = "payment_type")
    private String payment_type;
    @Column(name = "fare_amount")
    private String fare_amount;
    @Column(name = "extra")
    private String extra;
    @Column(name = "mta_tax")
    private String mta_tax;
    @Column(name = "tip_amount")
    private String tip_amount;
    @Column(name = "tolls_amount")
    private String tolls_amount;
    @Column(name = "improvement_surcharge")
    private String improvement_surcharge;
    @Column(name = "total_amount")
    private String total_amount;
    @Column(name = "congestion_surcharge")
    private String congestion_surcharge;
    @Column(name = "VendorID")
    private String VendorID;

    public Taxi(String tpep_pickup_datetime, String tpep_dropoff_datetime, String passenger_count, String ratecodeID, String store_and_fwd_flag, String PULocationID, String DOLocationID, String payment_type, String fare_amount, String extra, String mta_tax, String tip_amount, String tolls_amount, String improvement_surcharge, String total_amount, String congestion_surcharge, String vendorID) {
        this.tpep_pickup_datetime = tpep_pickup_datetime;
        this.tpep_dropoff_datetime = tpep_dropoff_datetime;
        this.passenger_count = passenger_count;
        RatecodeID = ratecodeID;
        this.store_and_fwd_flag = store_and_fwd_flag;
        this.PULocationID = PULocationID;
        this.DOLocationID = DOLocationID;
        this.payment_type = payment_type;
        this.fare_amount = fare_amount;
        this.extra = extra;
        this.mta_tax = mta_tax;
        this.tip_amount = tip_amount;
        this.tolls_amount = tolls_amount;
        this.improvement_surcharge = improvement_surcharge;
        this.total_amount = total_amount;
        this.congestion_surcharge = congestion_surcharge;
        VendorID = vendorID;
    }

    public String getTpep_pickup_datetime() {
        return tpep_pickup_datetime;
    }

    public String getTpep_dropoff_datetime() {
        return tpep_dropoff_datetime;
    }

    public String getPassenger_count() {
        return passenger_count;
    }

    public String getRatecodeID() {
        return RatecodeID;
    }

    public String getStore_and_fwd_flag() {
        return store_and_fwd_flag;
    }

    public String getPULocationID() {
        return PULocationID;
    }

    public String getDOLocationID() {
        return DOLocationID;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public String getFare_amount() {
        return fare_amount;
    }

    public String getExtra() {
        return extra;
    }

    public String getMta_tax() {
        return mta_tax;
    }


    public String getTip_amount() {
        return tip_amount;
    }

    public String getTolls_amount() {
        return tolls_amount;
    }

    public String getImprovement_surcharge() {
        return improvement_surcharge;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public String getCongestion_surcharge() {
        return congestion_surcharge;
    }

    public String getVendorID() {
        return VendorID;
    }

    public Taxi() {
    }
}

