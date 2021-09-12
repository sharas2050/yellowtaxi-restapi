package sarunas.com.taxiapi.controller;

import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sarunas.com.taxiapi.model.Taxi;
import sarunas.com.taxiapi.exception.ResourceNotFoundException;
import sarunas.com.taxiapi.model.*;
import sarunas.com.taxiapi.repository.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    ObjectFactory<SessionFactory> sessionFactory;

    @Autowired
    private TaxiRepository taxiRepository;

    @Autowired
    private TripLengthRepo tripLengthRepo;

    @Autowired
    private CounterRepository counterRepsoitory;
//    @CrossOrigin
//    @GetMapping("taxi")
//    public List<Taxi> getAllContacts(){
//        return this.contactRepository.findAll();
//    }

    @CrossOrigin
    @GetMapping("/taxi/limit")
    public List<Taxi> getLimit() throws ResourceNotFoundException {
        List<Taxi> contactInformation = taxiRepository.limit();
        return contactInformation;
    }

    @CrossOrigin
    @GetMapping("/taxi/count")
    public long getCount() throws ResourceNotFoundException {
        long contactInformation = taxiRepository.count();
        return contactInformation;
    }

    @CrossOrigin
    @GetMapping("/taxi/count/{start_date}/{end_date}")
    public List getCount(@PathVariable(value = "start_date") String start_date,@PathVariable(value = "end_date") String end_date) throws ResourceNotFoundException {
        List<Counter> contactInformation = counterRepsoitory.ccount(start_date,end_date);
        return contactInformation;
    }

    @CrossOrigin
    @GetMapping("/taxi/triplength/km")
    public List getAvgTripLen() throws ResourceNotFoundException {
        List<TripLength> contactInformation = tripLengthRepo.tripLengthKmTotal();
        return contactInformation;
    }

    @CrossOrigin
    @GetMapping("/taxi/triplength/km/{start_date}/{end_date}")
    public List getAvgTripLen(@PathVariable(value = "start_date") String start_date,@PathVariable(value = "end_date") String end_date) throws ResourceNotFoundException {
        List<TripLength> contactInformation = tripLengthRepo.tripLengthKm(start_date,end_date);
        return contactInformation;
    }


    @CrossOrigin
    @GetMapping("/taxi/triplength/min")
    public List getAvgTripLengthMin() throws ResourceNotFoundException {
        List<TripLength> contactInformation = tripLengthRepo.tripLengthMinTotal();
        return contactInformation;
    }

    @CrossOrigin
    @GetMapping("/taxi/triplength/min/{start_date}/{end_date}")
    public List getAvgTripLengthMin(@PathVariable(value = "start_date") String start_date,@PathVariable(value = "end_date") String end_date) throws ResourceNotFoundException {
        List<TripLength> contactInformation = tripLengthRepo.tripLengthMin(start_date,end_date);
        return contactInformation;
    }

    @CrossOrigin
    @GetMapping("/taxi/billing")
    public List getBilling() throws ResourceNotFoundException {
        List<TripLength> contactInformation = tripLengthRepo.billingTotal();
        return contactInformation;
    }

    @CrossOrigin
    @GetMapping("/taxi/billing/{start_date}/{end_date}")
    public List getBillingByDate(@PathVariable(value = "start_date") String start_date,@PathVariable(value = "end_date") String end_date) throws ResourceNotFoundException {
        List<TripLength> contactInformation = tripLengthRepo.billingByDate(start_date,end_date);
        return contactInformation;
    }

    @CrossOrigin
    @GetMapping("/taxi/billing/{start_date}/{end_date}/{pulocation}")
    public List getBillingByLocation(@PathVariable(value = "start_date") String start_date,@PathVariable(value = "end_date") String end_date, @PathVariable(value = "pulocation") String pulocation) throws ResourceNotFoundException {
        List<TripLength> contactInformation = tripLengthRepo.billingByDateAndLocation(start_date,end_date,pulocation);
        return contactInformation;
    }

}
