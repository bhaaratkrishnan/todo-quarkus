package org.acme;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private static List<TodoModel> todoList = new ArrayList<TodoModel>();

    public static List<TodoModel> getTodoList() {
        return todoList;
    }

    public static void addTodo(String title) {
        todoList.add(new TodoModel(todoList.size() + 1, title, false));
    }

    public static TodoModel updateTodo(int id) {
        TodoModel tempTodo = todoList.get(id - 1);
        tempTodo.setStatus(!tempTodo.getStatus());
        return tempTodo;
    }

    public static void deleteTodo(int id) {

        todoList.remove(id - 1);
    }
}
