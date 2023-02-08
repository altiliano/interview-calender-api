package rest.api.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Afonseca on 15/01/2023.
 **/
public class UserRest  implements Serializable {

    @Serial
    private static final long serialVersionUID = 5018996938209129996L;
    @NotBlank
    private String email;

    @NotNull
    private RoleRest role;

    @NotEmpty
    private Set<AvailabilityRest> availabilities = new HashSet<>();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RoleRest getRole() {
        return role;
    }

    public void setRole(RoleRest role) {
        this.role = role;
    }

    public Set<AvailabilityRest> getAvailabilities() {
        return availabilities;
    }

    public void setAvailabilities(Set<AvailabilityRest> availabilities) {
        this.availabilities = availabilities;
    }
}
