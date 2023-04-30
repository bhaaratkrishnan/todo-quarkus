package org.acme;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/todo")
public class TodoController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTodos() {
        return Response.ok(TodoList.getTodoList()).build();
    }

    @POST
    @Path("{newTitle}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public Response addTodo(@PathParam("newTitle") String newTitle) {
        TodoList.addTodo(newTitle);
        return Response.ok(newTitle).build();
    }

    @PUT
    @Path("/{id}/status")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateStatus(@PathParam("id") int id) {
        try {
            return Response.ok(TodoList.updateTodo(id)).build();
        } catch (IndexOutOfBoundsException err) {
            return Response.ok("Error Updating Todo").build();
        }
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public Response deleteTodo(@PathParam("id") int id) {
        String responseString;
        try {
            TodoList.deleteTodo(id);
            responseString = "Todo Deleted";
        } catch (IndexOutOfBoundsException err) {
            responseString = "Error Deleting todo";
        }
        return Response.ok(responseString).build();
    }
}
