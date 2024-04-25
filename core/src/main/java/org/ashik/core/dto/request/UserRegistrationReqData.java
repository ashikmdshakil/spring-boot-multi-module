package org.ashik.core.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegistrationReqData {

    @JsonProperty(value = "user_name")
    private String name;

    @JsonProperty(value = "user_email")
    private String email;

    @JsonProperty(value = "user_password")
    private String password;

    @JsonProperty(value = "mobile_number")
    private String mobileNumber;

}
