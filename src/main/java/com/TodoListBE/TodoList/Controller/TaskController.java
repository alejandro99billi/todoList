package com.TodoListBE.TodoList.Controller;

import com.TodoListBE.TodoList.Model.TaskCard;
import com.TodoListBE.TodoList.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
 private TaskRepository taskRepository;

    @GetMapping("/tasks")
    public List<TaskCard> allTask(){ return taskRepository.findAll();}

    @GetMapping("/task/{taskName}")
    public  List<TaskCard> findByTaskName(@PathVariable("taskName") String taskName){return taskRepository.findByTaskName(taskName);}

    @PostMapping("/task")
    public TaskCard  createTask(@RequestBody TaskCard taskCard){ return taskRepository.save(taskCard);}


    @PutMapping("/person/{id}")
    public TaskCard updateTask(@PathVariable int id ,@RequestBody TaskCard taskCard) {
        return taskRepository.save(taskCard);
    }


    @DeleteMapping("/task/{id}")
    public void deletePerson(@PathVariable("id") Long id) {
        taskRepository.deleteById(id);
    }
}

