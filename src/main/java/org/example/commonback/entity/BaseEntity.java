package org.example.commonback.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

/**
 * @author SKTT1Fiver
 */
@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 创建时间
     */
    @CreatedDate
    private LocalDateTime createdTime;

    /**
     * 最后修改时间
     */
    @LastModifiedDate
    private LocalDateTime lastModifiedTime;

    /**
     * 创建人ID
     */
    private Long creatorId;

    /**
     * 最后修改人ID
     */
    private Long lastModifierId;
}
