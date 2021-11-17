# Weekly Reflections
## Week 1
+ Held our first meeting Wednesday night to write our team resume and discuss potential project ideas. We discussed how 
we will be communicating and set up Discord to talk through channels there. We decided to meet via Zoom, and chose 
Wednesday and Sunday nights. We created the repo in GitHub and everyone cloned the project.
+ After meeting and giving some time to individually think about proposed project ideas, we decided what to build. John 
drafted the problem statement, Erik drafted the tools and technology list used, and Alivia drafted the team charter, and
we got together on Sunday to review our drafts and finalize.

## Week 2
+ Met Wednesday night to discuss feedback on week 1 submission and how to incorporate into the project. We also 
discussed first steps and how to divvy up work for the week.
+ Created project structure & started journal - Alivia
+ Create database, table structure, receive and format IRS data for database insertion - John
+ Create Zippopotamus DAO for zip codes and cities, test - Erik

## Week 3
+ Meetings Wednesday and Sunday about progress and functions
+ Began Swagger and README documentation, index page documentation - Alivia
+ Create ReportsResource and ReportsApplication to route API calls - Alivia
+ Deployed to AWS - Erik
+ Created Reports object and controller to populate reports with city, state, zip data - Erik
+ Finalize database, IncomeData entity, create IncomeDataDAO and test - John
### Week 3 Blockers:
+ Ran into challenges with GitHub branching and merging
+ Troubleshooting of null database column & bad insertion of data
+ A dependency was needed to convert an object to JSON 
+ We needed to switch data types to prevent zeros from being stripped

## Week 4
+ Met several times over the weekend to prioritize tasks and finalize functionality. Regularly deploying to AWS to see
progress. 
+ Connected database to API so income data returns with reports
+ Add optional year query param to methods
+ Add javaDoc and finalize documentation
### Week 4 Blockers:
+ Deploying to AWS stopped working