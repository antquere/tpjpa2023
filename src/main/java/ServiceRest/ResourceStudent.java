package ServiceRest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import DAO.StudentDao;
import DAOimpl.StudentDAOimpl;
import Model.Student;

import java.util.List;

@Path("/student")
public class ResourceStudent {
    private StudentDao studentDao = new StudentDAOimpl();

    @GET
    @Path("/{studentId}")
    @Produces("application/json")
    public Response getStudent(@PathParam("studentId") Long studentId, List<Student> ls) {
        Student student = studentDao.getById(ls, studentId);
        if (student != null) {
            return Response.status(Response.Status.OK).entity(student).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Consumes("application/json")
    public Response createStudent(Student student) {
        studentDao.createStudent(student);
        return Response.status(Response.Status.CREATED).build();
    }
}
