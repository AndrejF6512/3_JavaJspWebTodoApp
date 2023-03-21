package com.JavaJsp.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("Learn Java 17", "Java"));
		todos.add(new Todo("Learn Spring MVC", "Java"));
		todos.add(new Todo("Learn Jakarta EE", "Java"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}

	public void addTodo(Todo todo) {
		todos.add(todo);
	}

	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}

}
