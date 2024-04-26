package org.ashik.core.serviceImpl;

import org.ashik.core.dto.request.UserRegistrationReqData;
import org.ashik.core.dto.response.CommonResponseData;
import org.ashik.core.model.User;
import org.ashik.core.repository.UserRepository;
import org.ashik.core.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CommonResponseData registerUser(UserRegistrationReqData userRegistrationReqData) {
        //mapping request data to model
        User user = modelMapper.map(userRegistrationReqData, User.class);

        //saving data into db
        userRepository.save(user);

        //returning common response
        return new CommonResponseData("1","User has been registered successfully!");
    }
}
