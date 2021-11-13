# The Java Collective
It is difficult to find freely available income data that is easy to lookup. We aim to solve this by making income data from the IRS freely available via an easy to use API that will provide average income data by U.S. ZIP code or city. To more easily facilitate lookup by city we will use the Zippopotam.US API as a backend to get ZIP codes by city.  
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
* CSS
    * Bootstrap  
* Data Validation
    * Bootstrap Validator for front end
    * Explore Hibernate's validation
* Logging
    * Log4J2
* Hosting
    * AWS

* Unit Testing
    * JUnit tests to achieve 80%+ code coverage
* IDE: IntelliJ IDEA


### Project Operations

* API incoming user request with zipcode   
* API output zipcode, median income, city, state
* API documentation page(s)