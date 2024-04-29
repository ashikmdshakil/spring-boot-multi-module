package org.ashik.core.serviceImpl;

import org.ashik.core.dto.request.UserRegistrationReqData;
import org.ashik.core.dto.response.CommonResponseData;
import org.ashik.core.model.Role;
import org.ashik.core.model.User;
import org.ashik.core.repository.RoleRepository;
import org.ashik.core.repository.UserRepository;
import org.ashik.core.service.UserService;
import org.ashik.exception.ArgumentNotValidException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CommonResponseData registerUser(UserRegistrationReqData userRegistrationReqData) {
        //mapping request data to model
        User user = modelMapper.map(userRegistrationReqData, User.class);
        Role role = roleRepository.findById(1L).orElseThrow(() -> new ArgumentNotValidException("No user role found in system!"));
        user.getRoles().add(role);

        //saving data into db
        userRepository.save(user);

        //returning common response
        return new CommonResponseData("1","User has been registered successfully!");
    }
}
