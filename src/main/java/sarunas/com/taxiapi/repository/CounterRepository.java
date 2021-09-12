package sarunas.com.taxiapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sarunas.com.taxiapi.model.Counter;

import java.util.List;

@Repository
public interface CounterRepository extends JpaRepository<Counter, Long> {

    @Query(value = "SELECT count(*) as ccount FROM tripdata " +
            "where date(cast(tpep_pickup_datetime as timestamp)) between date(:start_date) and date(:end_date)", nativeQuery=true)
    List<Counter> ccount(@Param("start_date") String start_date,@Param("end_date") String end_date);

}

