package hruser.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;
    private String password;

    /* Mapeamento relacional na JPA... Um Usuário tem vários ROLES,
        no caso a tabela relacional que será utilizada é a tb_user_role,
        ela irá conter o id do usuário e o id ds roles
        e não pode haver repetição do Usuário, por isto usa o SET, para não repetir
        o set faz uma coleção, então ele vai agrupar o mesmo usuário e os valores dos ROLE
     */
    @ManyToMany(fetch = FetchType.EAGER) //obriga a carregar tudo junto
    @JoinTable(
              name = "tb_user_role",
              joinColumns = @JoinColumn(name = "user_id"),
              inverseJoinColumns = @JoinColumn(name = "role_id")
            )
    private Set<Role> roles = new HashSet<>();

    public User(){
     }

    public User(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }


}
