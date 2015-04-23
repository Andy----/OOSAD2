use test;
DROP TABLE IF EXISTS Employee;
DROP TABLE IF EXISTS Sales;
CREATE TABLE Employee (ID int(11) NOT NULL AUTO_INCREMENT, PPS varchar(255), Name varchar(255), Address varchar(255), YearsService int(11) NOT NULL, Age int(11) NOT NULL, Mobile varchar(255), PRIMARY KEY (ID));
CREATE TABLE Sales (ID int(11) NOT NULL AUTO_INCREMENT, TotalSales int(11) NOT NULL, FinancialYear varchar(255), PRIMARY KEY (ID));
