package com.TodoListBE.TodoList.Repository;

import com.TodoListBE.TodoList.Model.TaskCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository  extends JpaRepository<TaskCard,Long> {
    List<TaskCard> findByTaskName(@Param("taskName") String taskName);
}
