package org.ashik.core.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommonResponseData {

    @JsonProperty(value = "message_code")
    private String messageCode;

    @JsonProperty(value = "message")
    private String message;
}
