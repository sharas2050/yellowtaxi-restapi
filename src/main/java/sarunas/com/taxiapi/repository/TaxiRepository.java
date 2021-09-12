package sarunas.com.taxiapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sarunas.com.taxiapi.model.Taxi;

import java.util.List;

@Repository
public interface TaxiRepository extends JpaRepository<Taxi, Long> {

    @Query(value = "SELECT * FROM tripdata limit 10", nativeQuery=true)
    List<Taxi> limit();

}

