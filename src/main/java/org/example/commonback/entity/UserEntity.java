package org.example.commonback.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.sagacity.sqltoy.config.annotation.Column;

/**
 * @author SKTT1Fiver
 */
@Setter
@Getter
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity{

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

}
