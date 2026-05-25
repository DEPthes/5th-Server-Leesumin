package hello.jpa;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MBR")
public class Member {
    @Id
    private Long id;
    @Column(name = "name", insertable = true, updatable = true)
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;

    @Transient
    private int temp;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public void setRoleType(RoleType roleType) {
    }
}
