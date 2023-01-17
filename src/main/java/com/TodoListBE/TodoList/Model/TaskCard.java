package com.TodoListBE.TodoList.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@Data
@Entity
@Table(name = "task")
@EntityListeners(AuditingEntityListener.class)
public class TaskCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String taskName;

    @Column(name = "description")
    private String description;

    @Column(name = "date_registry")
    @CreatedDate
    private Date date;

}
