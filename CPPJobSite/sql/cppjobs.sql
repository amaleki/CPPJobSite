create database IF NOT EXIST CPPJOBS;

create table IF NOT EXISTS job( 
	jobid INT NOT NULL AUTO_INCREMENT,
	title VARCHAR(100) NOT NULL,
	description VARCHAR(100) NOT NULL,
	requirements VARCHAR(100),
	rate VARCHAR(100),
	city VARCHAR(100),
	state VARCHAR(100),
	division VARCHAR(100),
	companyid INT NOT NULL,
	create_date DATE,
	PRIMARY KEY (jobid)
  	);

create table if not exists company(
	companyid INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(100) NOT NULL,
	url VARCHAR(100),
	address VARCHAR(100),
	city VARCHAR(100),
	state VARCHAR(100),
	zip VARCHAR(10),
	PRIMARY KEY (companyid)
	);

create table if not exists application(
	jobid INT NOT NULL,
	userid INT NOT NULL,
	resume VARCHAR(255),
	coverletter VARCHAR(255),
	create_date DATE,
	PRIMARY KEY (jobid, userid)
	);

create table if not exists account(
	userid INT NOT NULL AUTO_INCREMENT ,
	firstname VARCHAR(200),
	lastname VARCHAR(200),
	email VARCHAR(255),
	phone VARCHAR(20),
	type VARCHAR(10),
	password VARCHAR(60),
	PRIMARY KEY (userid)
	);