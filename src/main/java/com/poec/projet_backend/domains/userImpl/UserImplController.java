package com.poec.projet_backend.domains.userImpl;

import com.poec.projet_backend.domains.AbstractController;
import com.poec.projet_backend.domains.type.Type;
import com.poec.projet_backend.domains.type.TypeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserImplController {


    @Autowired
    private UserImplService userService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/get/email/{email}")
    public ResponseEntity<UserImplDTO> getById(@PathVariable String email) {
        List<UserImpl> users = userService.getAll();
        for (UserImpl user : users){
            if (user.getEmail().equals(email)){
                return new ResponseEntity<>(userMapper.mapUserToUser(user), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<UserImplDTO> getById(@PathVariable Long id) {
        UserImpl foundUser = userService.getById(id);
        return new ResponseEntity<>(userMapper.mapUserToUser(foundUser), HttpStatus.OK);
    }

}
