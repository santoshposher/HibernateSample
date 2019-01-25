import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Bank_Branch")
public class Branch {
    @Id
    private String city;
    @ElementCollection
    @Column(name="Bank_Branches")
    private Set<Address> listOfAddress=new HashSet();

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<Address> getListOfAddress() {
        return listOfAddress;
    }

    public void setListOfAddress(Set<Address> listOfAddress) {
        this.listOfAddress = listOfAddress;
    }
}
