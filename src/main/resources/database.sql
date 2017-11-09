--
-- Table structure for table `people`
--
CREATE TABLE people (
  people_id number(11) NOT NULL,
  last_name varchar2(255) NOT NULL,
  first_name varchar2(255) NOT NULL,
  PRIMARY KEY (people_id)
);
CREATE SEQUENCE people_temp START WITH 1;