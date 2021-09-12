# yellowtaxi-restapi

REST API for NYC yellow taxi data

Fetch data from Hive table using presto JDBC driver

Endpoints:

```curl
GET /api/v1/taxi/billing --getTotalAmount
GET/api/v1/taxi/billing/{start_date}/{end_date} --getTotalAmountByDate
GET /api/v1/taxi/billing/{start_date}/{end_date}/{pulocation} --getTotalAmountByDateAndLocation
GET /api/v1/taxi/count --getCountOfTrips
GET /api/v1/taxi/count/{start_date}/{end_date} --getCountOfTripsByDate
GET /api/v1/taxi/limit --sampleDataOf10Records
GET /api/v1/taxi/triplength/km --getTripStatisticsTotal in km
GET /api/v1/taxi/triplength/km/{start_date}/{end_date} --getTripStatisticsByDate in km
GET /api/v1/taxi/triplength/min --getTripStatisticsTotal in min
GET /api/v1/taxi/triplength/min/{start_date}/{end_date} getTripStatisticsByDate in min
```
