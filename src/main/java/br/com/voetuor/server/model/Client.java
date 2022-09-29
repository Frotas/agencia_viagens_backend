package br.com.voetuor.server.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @Column(name = "pk_client", nullable = false)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID pkClient;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "avatar", nullable = true)
    private String avatar;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "passwd", nullable = false)
    private String passwd;

    public Client() { }
    public Client(UUID pkClient, String firstName, String lastName, String email, String passwd) {
        this.pkClient = pkClient;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passwd = passwd;
    }

    public UUID getPkClient() {
        return pkClient;
    }
    public void setPkClient(UUID pkClient) {
        this.pkClient = pkClient;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAvatar() { return avatar; }
    public void setAvatar(String avatar) { this.avatar = avatar; }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Client client)) return false;
        return Objects.equals(getPkClient(), client.getPkClient());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPkClient());
    }

}
