package com.monstershop.backend.service;



import com.monstershop.backend.dto.UserRequest;
import com.monstershop.backend.dto.UserResponse;
import com.monstershop.backend.exception.EntityNotFoundException;
import com.monstershop.backend.model.User;
import com.monstershop.backend.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import com.monstershop.backend.dto.UserMapper;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserResponse> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(user -> UserMapper.entityToDto(user)).toList();

    }

    public UserResponse getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Product", id));
        return UserMapper.entityToDto(user);
    }

    public UserResponse addUser(@Valid UserRequest userRequest) {
        User user = UserMapper.dtoToEntity(userRequest);
        User savedUser = userRepository.save(user);
        return UserMapper.entityToDto(savedUser);
    }

}
