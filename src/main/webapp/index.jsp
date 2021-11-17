<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Java Collective API</title>

    <script   src="https://code.jquery.com/jquery-3.2.1.min.js"   integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="   crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.min.js"></script>
    <!-- Latest compiled and minified CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <!-- The next two items are to support jQuery datatables. Learn more about datatables here:https://datatables.net -->
    <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.13/css/jquery.dataTables.css">
    <script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.13/js/jquery.dataTables.js"></script>
    <!-- used for add, edit, delete icons -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <!-- css for datepicker -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker.css">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <!-- Personal JavaScript -->
    <script src="javascript/javaScript.js"></script>
</head>

<body>
    <div class="container">
        <h1>Income Data API</h1>
        <div class="header mb-2">
            <h2>Overview</h2>
            <p class="fw-bold"> For full documentation please see README on GitHub: <a href="https://github.com/johnoliver42/The-Java-Collective">Documentation</a> </p>
            <p>This API provides median income of a zip code for a given year, with data from IRS reports of the span of
                2015 - 2019. The year is an optional parameter, and if no year is provided, info for the most recent year
                (2019) is returned. Users can search for a single zip code, or search by city and state, which will
                provide a list of zip codes and their respective info within the city.
            </p>
            <p> The response is built around the Reports object, which contains zip code, city name, state name,
                average income of the zip code for a year, and the year the data was provided.
                <ul>
                    <li>If searching for zip code, only zip code is required, and year is an optional parameter. </li>
                    <li>If searching for city, city and state are required, and year is an optional parameter. </li>
                </ul>
            </p>
        </div>
        <div class="card mb-2">
            <div class="card-header"><h3>Reports Object</h3></div>
            <div class="card-body">
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>Parameter</th>
                            <th>Description</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>zipCode</td>
                            <td>5 digit zip code ex. 53703 </td>
                        </tr>
                        <tr>
                            <td>city</td>
                            <td>Name of City ex. Madison</td>
                        </tr>
                        <tr>
                            <td>state</td>
                            <td>Name of State ex. WI</td>
                        </tr>
                        <tr>
                            <td>householdMedianIncome</td>
                            <td>Household Median Income of zip code for a given year ex. 19000.00</td>
                        </tr>
                        <tr>
                            <td>year</td>
                            <td>Year of reported median income (OPTIONAL) (Default 2019)</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>

        <div class="card mb-2">
            <div class="card-header">
                <h3>GET median income of most recent year by zip code</h3>
            </div>
            <div class="card-body">
                <p class="fw-bold">Endpoint Structure: </p>
                <p> /income-data/reports/zip-codes/{zipCode} </p>
                <p class="fw-bold">Example Endpoint: </p>
                <p class="fst-italic"> /income-data/reports/zip-codes/53703 </p>
            </div>
        </div>
        <div class="card mb-2">
            <div class="card-header">
                <h3>GET median income by zip code and year</h3>
            </div>
            <div class="card-body mb-2">
                <p class="fw-bold"> Endpoint Structure: </p>
                <p> /income-data/reports/zip-codes/{zipCode}?year={year} </p>
                <p class="fw-bold">Example Endpoint: </p>
                <p class="fst-italic"> /income-data/reports/zip-codes/53703?year=2018 </p>
            </div>
        </div>
        <div class="card mb-2">
            <div class="card-header">
                <h3>GET median income of most recent year for all zip codes by city</h3>
            </div>
            <div class="card-body">
                <p class="fw-bold">Endpoint Structure:</p>
                <p> /income-data/reports/state/{state}/city/{city} </p>
                <p class="fw-bold">Example Endpoint: </p>
                <p class="fst-italic"> /income-data/reports/state/wi/city/madison </p>
            </div>
        </div>
        <div class="card mb-2">
            <div class="card-header">
                <h3>GET median income for all zip codes by city and year</h3>
            </div>
            <div class="card-body">
                <p class="fw-bold">Endpoint Structure: </p>
                <p> /income-data/reports/state/{state}/city/{city}?year={year} </p>
                <p class="fw-bold">Example Endpoint: </p>
                <p class="fst-italic"> /income-data/reports/state/wi/city/madison?year=2018 </p>
            </div>
        </div>

        <article>
            <p>Brought to you by The Java Collective - Erik, John, and Alivia</p>
        </article>
    </div>
</body>
</html>
