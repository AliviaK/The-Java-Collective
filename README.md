# The Java Collective
## Overview
It is difficult to find freely available income data that is easy to lookup. This api solves this by making income data 
from the IRS freely available via an easy to use API that will provide average income data by U.S. ZIP code or city. To 
more easily facilitate lookup by city we will use the Zippopotam.US API as a backend to get ZIP codes by city.
These reports cover a five-year span of 2015 through 2019.

---

### Service provided:
- Get a report of median income for a given a zip code in json. A year can be optionally specified, or the report will be for 
the most recent year (2019). 
- Get a list of reports of median income for a given city and state. A year can be optionally specified, or the report will be
for the most recent year (2019).

---

### Project Technologies/Techniques
* Database
    * MySQL Hosted on AWS
    * Data From  https://data.census.gov/cedsci/ (median income VS zipcode)
* ORM Framework
    * Hibernate 5
* Dependency Management
    * Maven
* Web Services consumed using Java
    * http://api.zippopotam.us (zip code information, City / State)
* Data Validation
    * Explore Hibernate's validation
* Logging
    * Log4J2
* Hosting
    * AWS

* Unit Testing
    * JUnit tests 
* IDE: IntelliJ IDEA
---

## Resources

| property | description | type | 
| --- | --- | --- |
| zipCode | the Reports five-digit US zip code ex. 53703 | int |
| householdMedianIncome | the Reports average income within the zip code | float |
| year | the Reports year in format YYYY between years 2015 - 2019 ex. 2019 (OPTIONAL) | int |
| state | the Reports state using two-letter state abbreviation ex. WI | String |
| city | the Reports city ex. Madison | String |
 

## Service Calls
- GET reports/zip-code/{zipCode}
- GET reports/zip-code/{zipCode}?year={year}
- GET reports/state/{state}/city/{city}
- GET reports/state/{state}/city/{city}?year={year}

---

### Get reports/zip-code/{zip-code}
Takes a zipCode; Returns json of a Reports object with zipCode, state, city, most recent year (2019), and median income for the year
Example Curl Request:  

| curl --request GET http://thejavacollective-env.eba-pg8d6h4p.us-east-2.elasticbeanstalk.com/income-data/reports/zip-codes/90210 |
| --- |

Example Success Response:

| [{"zipCode":90210,"householdMedianIncome":147270.0,"year":2019,"state":"California","city":"Beverly Hills"}] |
| --- |

---

### Get reports/zip-code/{zip-code}?year={year}
Takes a zipCode and year; Returns json of a Reports object with zipCode, state, city, chosen year, and median income for chosen year
Example Curl Request:

| curl --request GET http://thejavacollective-env.eba-pg8d6h4p.us-east-2.elasticbeanstalk.com/income-data/reports/zipCodes/53589?year=2018 |
| --- |

Example Success Response:

| [{"zipCode":53593,"householdMedianIncome":103281.0,"year":2018,"state":"Wisconsin","city":"Verona"}] |
| --- |

---

### Get reports/state/{state}/city/{city}
Takes a state and city; Returns a json array of Reports objects with zipCode, state, city, most recent year (2019), and median income for the year \

Example Curl Request:

| curl --request GET curl --request GET http://thejavacollective-env.eba-pg8d6h4p.us-east-2.elasticbeanstalk.com/income-data/reports/state/oh/city/brecksville |
| --- |

Example Success Response:

| [{"zipCode":44141,"householdMedianIncome":108406.0,"year":2019,"state":"oh","city":"brecksville"}] |
| --- |

---

### Get reports/state/{state}/city/{city}?year={year}
Takes a state, city and year; Returns a json array of Reports objects with zipCode, state, city, chosen year, and median income for chosen year \
Example Curl Request:

| curl --request GET http://thejavacollective-env.eba-pg8d6h4p.us-east-2.elasticbeanstalk.com/income-data/reports/state/pa/city/mechanicsburg?year=2017 |
| --- |

Example Success Response:

| [{"zipCode":17050,"householdMedianIncome":85037.0,"year":2017,"state":"pa","city":"mechanicsburg"},{"zipCode":17055,"householdMedianIncome":64836.0,"year":2017,"state":"pa","city":"mechanicsburg"}] |
| --- |


---
### Example Error Response For GET calls (No data found): 

| {} |
| --- |
### Project Operations

* API incoming user request with zipcode   
* API output zipcode, median income, city, state
* API documentation page(s)

