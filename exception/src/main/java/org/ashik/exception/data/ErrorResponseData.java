package org.ashik.exception.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponseData {

    @JsonProperty(value = "message_code")
    private String messageCode;

    @JsonProperty(value = "message")
    private String message;

    public ErrorResponseData(String message, String messageCode) {
        this.message = message;
        this.messageCode = messageCode;
    }
}
