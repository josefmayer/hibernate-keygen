## Hibernate Key Generation
Creating entity IDs with auto-increment and UUID  <br />
Persisting and retrieving entities from database <br />


### Technologies
JPA, Hibernate, MySQL <br />
ID Generation: auto-increment, UUID <br /> 


### Project Structure
##### Model
Entities: <br />
Address <br />
AddressUuid <br />

##### DAO
CRUD operations <br />
AddressDao <br />






### Steps
##### MySQL
Start MySQL server  <br />

create database: <br />
*mysql –uroot –p –e “source src/main/resources/create_database.sql”*  <br />

create tables:  <br />
*mysql –uroot –p –e “source src/main/resources/create_table_address.sql”*  <br />
*mysql –uroot –p –e “source src/main/resources/create_table_address_uuid.sql”*  <br />


##### Compile, create jar
*mvn clean compile package*  <br />


##### Run Application
*java -jar target/jar-name.jar* <br />



