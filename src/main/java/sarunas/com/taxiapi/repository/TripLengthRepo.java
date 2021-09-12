package sarunas.com.taxiapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sarunas.com.taxiapi.model.TripLength;

import java.util.List;

@Repository
public interface TripLengthRepo extends JpaRepository<TripLength, Long> {

    @Query(value = "select sum(CAST(trip_distance AS decimal(10,2))) as total, " +
            "avg(CAST(trip_distance AS decimal(10,2))) as average, " +
            "approx_percentile(CAST(trip_distance AS decimal(10,2)),0.5) as median " +
            "from yellowtaxi.tripdata", nativeQuery=true)
    List<TripLength> tripLengthKmTotal();

    @Query(value = "select sum(CAST(trip_distance AS decimal(10,2))) as total, " +
            "avg(CAST(trip_distance AS decimal(10,2))) as average, " +
            "approx_percentile(CAST(trip_distance AS decimal(10,2)),0.5) as median " +
            "from yellowtaxi.tripdata " +
            "where date(cast(tpep_pickup_datetime as timestamp)) between date(:start_date) and date(:end_date)", nativeQuery=true)
    List<TripLength> tripLengthKm(@Param("start_date") String start_date,@Param("end_date") String end_date);

    @Query(value = "select sum(CAST(trip_time_m AS decimal(10,2))) as total, " +
            "avg(CAST(trip_time_m AS decimal(10,2))) as average, " +
            "approx_percentile(CAST(trip_time_m AS decimal(10,2)),0.5) as median " +
            "from yellowtaxi.tripdata ", nativeQuery=true)
    List<TripLength> tripLengthMinTotal();

    @Query(value = "select sum(CAST(trip_time_m AS decimal(10,2))) as total, " +
            "avg(CAST(trip_time_m AS decimal(10,2))) as average, " +
            "approx_percentile(CAST(trip_time_m AS decimal(10,2)),0.5) as median " +
            "from yellowtaxi.tripdata " +
            "where date(cast(tpep_pickup_datetime as timestamp)) between date(:start_date) and date(:end_date)", nativeQuery=true)
    List<TripLength> tripLengthMin(@Param("start_date") String start_date,@Param("end_date") String end_date);

    @Query(value = "select sum(CAST(total_amount AS decimal(10,2))) as total, avg(CAST(total_amount AS decimal(10,2))) as average, approx_percentile(CAST(total_amount AS decimal(10,2)),0.5) as median from yellowtaxi.tripdata", nativeQuery=true)
    List<TripLength> billingTotal();

    @Query(value = "select sum(CAST(total_amount AS decimal(10,2))) as total, " +
            "avg(CAST(total_amount AS decimal(10,2))) as average, " +
            "approx_percentile(CAST(total_amount AS decimal(10,2)),0.5) as median " +
            "from yellowtaxi.tripdata " +
            "where PULocationID=:pulocation and " +
            "date(cast(tpep_pickup_datetime as timestamp)) between date(:start_date) and date(:end_date)", nativeQuery=true)
    List<TripLength> billingByDateAndLocation(@Param("start_date") String start_date,@Param("end_date") String end_date,@Param("pulocation") String pulocation);

    @Query(value = "select sum(CAST(total_amount AS decimal(10,2))) as total, " +
            "avg(CAST(total_amount AS decimal(10,2))) as average, " +
            "approx_percentile(CAST(total_amount AS decimal(10,2)),0.5) as median " +
            "from yellowtaxi.tripdata where " +
            "date(cast(tpep_pickup_datetime as timestamp)) between date(:start_date) and date(:end_date)", nativeQuery=true)
    List<TripLength> billingByDate(@Param("start_date") String start_date,@Param("end_date") String end_date);

}

