use jpa_example;
create table address_uuid (
  id varchar(36),
  street varchar(50) NOT NULL,
  city varchar(50) NOT NULL,
  country varchar(50) NOT NULL,
  postcode varchar(50) NOT NULL,
  primary key (id)
);