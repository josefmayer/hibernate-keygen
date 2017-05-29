package josefmayer.KeyGen;

import java.util.List;

/**
 * Created by Josef Mayer on 28.05.2017.
 */
public class KeyGenApp {

    public static void main(String[] args){
        AddressDao addressDao = new AddressDao();

        insertAddresses(addressDao);
        queryJPQLAll(addressDao);

        insertAddressesUuid(addressDao);
        queryJPQLAllUuid(addressDao);

    }

    static void insertAddresses(AddressDao addressDao){
        Address ad1 = new Address();
        ad1.setCity("Bordeaux").setCountry("France").setPostcode("1234").setStreet("Rue Laroche");
        addressDao.persistAddress(ad1);

        Address ad2 = new Address();
        ad2.setCity("Valencia").setCountry("Spain").setPostcode("7788").setStreet("Av del Cid");
        addressDao.persistAddress(ad2);

        Address ad3 = new Address();
        ad3.setCity("Brighton").setCountry("United Kingdom").setPostcode("654").setStreet("Manor Hill");
        addressDao.persistAddress(ad3);

        Integer id = ad1.getId();
        Address addr = addressDao.findById(id);
        System.out.println("****" + addr.getCountry() + " " + addr.getCity() + " " + addr.getStreet() + " " + addr.getPostcode());
    }


    static void insertAddressesUuid(AddressDao addressDao){
        AddressUuid ad1 = new AddressUuid();
        ad1.setCity("Aarhus").setCountry("Denmark").setPostcode("1245").setStreet("Viborgvej");
        addressDao.persistAddressUuid(ad1);

        AddressUuid ad2 = new AddressUuid();
        ad2.setCity("Utrecht").setCountry("Netherlands").setPostcode("3355").setStreet("Ringwade");
        addressDao.persistAddressUuid(ad2);

        AddressUuid ad3 = new AddressUuid();
        ad3.setCity("Bologna").setCountry("Italy").setPostcode("8642").setStreet("Viale Aldini");
        addressDao.persistAddressUuid(ad3);


        String Uuid = ad1.getId();
        AddressUuid addr = addressDao.findByUuid(Uuid);
        System.out.println("****" + addr.getCountry() + " " + addr.getCity() + " " + addr.getStreet() + " " + addr.getPostcode());

    }


    static void queryJPQLAll(AddressDao addressDao){
        List<Address> addressList = addressDao.findAll();
        printAddressList(addressList);
    }

    static void queryJPQLAllUuid(AddressDao addressDao){
        List<AddressUuid> addressList = addressDao.findAllUuid();
        printAddressListUuid(addressList);
    }

    static void printAddressList(List<Address> addressList){
        System.out.println("\n****** Addresses: ******");
        for (Address addr : addressList){
            System.out.println(addr.getCountry() + " " + addr.getCity() + " " + addr.getStreet() + " " + addr.getPostcode());
        }
        System.out.println();
    }

    static void printAddressListUuid(List<AddressUuid> addressList) {
        System.out.println("\n****** Addresses: ******");
        for (AddressUuid addr : addressList) {
            System.out.println(addr.getCountry() + " " + addr.getCity() + " " + addr.getStreet() + " " + addr.getPostcode());
        }
        System.out.println();

    }

}
