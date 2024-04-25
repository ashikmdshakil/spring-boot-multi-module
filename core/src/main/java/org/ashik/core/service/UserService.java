package org.ashik.core.service;

import org.ashik.core.dto.request.UserRegistrationReqData;
import org.ashik.core.dto.response.CommonResponseData;

public interface UserService {
    CommonResponseData registerUser(UserRegistrationReqData userRegistrationReqData);
}
