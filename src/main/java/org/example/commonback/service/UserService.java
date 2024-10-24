package org.example.commonback.service;

import org.example.commonback.entity.UserEntity;
import org.springframework.stereotype.Service;

/**
 * @author SKTT1Fiver
 */
@Service
public interface UserService {

    UserEntity findByUsername(String username);
}
