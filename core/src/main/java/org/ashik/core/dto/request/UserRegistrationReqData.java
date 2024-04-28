package org.ashik.core.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ashik.core.model.Role;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegistrationReqData {

    @JsonProperty(value = "user_name")
    @NotBlank(message = "User name can not be empty.")
    private String name;

    @JsonProperty(value = "user_email")
    private String email;

    @JsonProperty(value = "user_password")
    @NotBlank(message = "User password can not be empty.")
    private String password;

    @JsonProperty(value = "mobile_number")
    @NotBlank(message = "User mobile number can not be empty.")
    private String mobileNumber;

}
