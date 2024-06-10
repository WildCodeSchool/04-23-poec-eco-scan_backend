package com.poec.projet_backend.domains.userImpl;

import com.poec.projet_backend.domains.AbstractController;
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
public class UserImplController extends AbstractController<UserImpl> {


    @Autowired
    private UserImplService userService;

    @GetMapping("/get/email/{email}")
    public ResponseEntity<UserImpl> getById(@PathVariable String email) {
        List<UserImpl> users = userService.getAll();
        for (UserImpl user : users){
            if (user.getEmail().equals(email)){
                return new ResponseEntity<>(user, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
