# bank

This project is a Spring Boot Application deployed in Heroku.

It consist of two API's 
1.Given an IFSC code, gets the bank details.
2.Given Bank name and city name, gets all bank branches in that city.

https://soma-mahanty-indian-banks.herokuapp.com/getBranches?city=MUMBAI&name=ANDHRA+BANK
https://soma-mahanty-indian-banks.herokuapp.com/getBranchDetail?ifsc=ANDB0000028

The app is deployed in Heroku and database used in ElephantSQL(Postgresql).

Error Conditions:
1.City and/or bank not given
2.City and/or bank does not exist
3.IFSC Code does not exist
4.IFSC Code not given

