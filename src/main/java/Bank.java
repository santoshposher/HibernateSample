import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Bank_table")
public class Bank {
    @Id
    @Column(name="id")
    private  int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
