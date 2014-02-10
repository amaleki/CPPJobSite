insert into company (companyid, name, url, address, city, state, zip) 
	values (1,'ACME','http://en.wikipedia.org/wiki/Acme_Corporation','1337 Kellog Dr','Pomona','CA','91766');
insert into company (companyid, name, url, address, city, state, zip) 
	values (2, 'Dunder Mifflin Inc.','http://www.dundermifflin.com/','1337 Office Way','Pomona','CA','91766');	
insert into company (companyid, name, url, address, city, state, zip) 
	values (3, 'INITECH','http://www.initechinfo.com/','1337 Office Space Way','Pomona','CA','91766');
	
insert into job (title, description,requirements,rate,city,state,division,companyid,create_date) 
	values ('ACME Internship','Join ACME as a summer Intern!','','','Pomona','CA','ACME Products',1,'2014-01-01');
insert into job (title, description,requirements,rate,city,state,division,companyid,create_date) 
	values ('Dunder Mifflin Internship','Join Dunder Mifflin as a summer Intern! We sell paper!','','','Pomona','CA','Sales Team',2,'2014-01-01');
insert into job (title, description,requirements,rate,city,state,division,companyid,create_date) 
	values ('INITECH Internship','Join INITECH as a summer Intern! Please ensure a cover sheet when submitting your resume.','','','Pomona','CA','IT',3,'2014-01-01');
	