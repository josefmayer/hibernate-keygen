package josefmayer.KeyGen;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Josef Mayer on 25.05.2017.
 */
public class AddressDao{

    public void persistAddress(Address address) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(address);
        em.getTransaction().commit();
        em.close();

        emf.close();

    }

    public void persistAddressUuid(AddressUuid addressUuid) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(addressUuid);
        em.getTransaction().commit();
        em.close();

        emf.close();

    }


    public Address findById(Integer id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Address address = em.find(Address.class, id);
        em.getTransaction().commit();
        em.close();
        emf.close();

        return address;
    }

    public AddressUuid findByUuid(String uuid) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        AddressUuid address = em.find(AddressUuid.class, uuid);
        em.getTransaction().commit();
        em.close();
        emf.close();

        return address;
    }

    //JPQL
    public List<Address> findAll(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Query query = em.createQuery("SELECT addr FROM Address addr");
        List<Address> resultList = query.getResultList();

        em.getTransaction().commit();
        em.close();
        emf.close();
        return resultList;
    }

    //JPQL
    public List<AddressUuid> findAllUuid(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Query query = em.createQuery("SELECT addr FROM AddressUuid addr");
        List<AddressUuid> resultList = query.getResultList();

        em.getTransaction().commit();
        em.close();
        emf.close();
        return resultList;
    }

    //JPQL
    public void deleteAll(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Query q1 = em.createQuery("DELETE FROM Address");
        q1.executeUpdate();
        em.getTransaction().commit();
        em.close();
        emf.close();
    }


}
