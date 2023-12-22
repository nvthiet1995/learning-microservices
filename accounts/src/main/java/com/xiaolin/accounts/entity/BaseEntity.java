package com.xiaolin.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter @Setter @ToString
public class BaseEntity {

//    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

//    @CreatedBy
    @Column(updatable = false)
    private String createdBy;

//    @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime updatedAt;

//    @LastModifiedBy
    @Column(insertable = false)
    private String updatedBy;

}
