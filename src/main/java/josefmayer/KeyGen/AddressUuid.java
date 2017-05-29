package josefmayer.KeyGen;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by Josef Mayer on 28.05.2017.
 */


@Entity
@Table(name = "address_uuid")
public class AddressUuid {
    @Id
    //@GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String street;
    private String city;
    private String country;
    private String postcode;


    public AddressUuid(){
        this.id = UUID.randomUUID().toString();
    }
    public String getId() {
        return id;
    }

//    public AddressD setId(Integer id) {
//        this.id = id;
//        return this;
//    }

    public String getStreet() {
        return street;
    }

    public AddressUuid setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getCity() {
        return city;
    }

    public AddressUuid setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public AddressUuid setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getPostcode() {
        return postcode;
    }

    public AddressUuid setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

}
