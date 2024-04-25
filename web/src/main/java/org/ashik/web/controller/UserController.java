package org.ashik.web.controller;

import org.ashik.core.dto.request.UserRegistrationReqData;
import org.ashik.core.service.UserService;
import org.ashik.web.constant.WebUriConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // new user sign up
    @PostMapping(value = WebUriConstant.USER_REGISTRATION)
    public ResponseEntity<?> registerUser(@RequestBody UserRegistrationReqData userRegistrationReqData){
        return new ResponseEntity<>(userService.registerUser(userRegistrationReqData),HttpStatus.OK);
    }

}
