import javax.persistence.Entity;

@Entity
public class User {

    @NotEmpty
    private String name;

    @NotEmpty
    private String email;

    // Other fields, getters, and setters
}
