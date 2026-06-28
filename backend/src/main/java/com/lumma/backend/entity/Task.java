package com.lumma.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="tasks", schema="lumma")
public class Task extends BaseEntity {

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="chat_id")
    private Chat chat;

    @Column(nullable=false)
    private String title;

    @Column(columnDefinition="TEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private TaskStatus status=TaskStatus.PENDING;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private TaskPriority priority=TaskPriority.MEDIUM;

    @Column(name="due_date")
    private LocalDateTime dueDate;

}