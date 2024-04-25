package org.ashik.core.serviceImpl;

import org.ashik.core.dto.request.UserRegistrationReqData;
import org.ashik.core.dto.response.CommonResponseData;
import org.ashik.core.repository.UserRepository;
import org.ashik.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public CommonResponseData registerUser(UserRegistrationReqData userRegistrationReqData) {
        //userRepository.save(user);
        return new CommonResponseData("1","User has been registered successfully!");
    }
}
