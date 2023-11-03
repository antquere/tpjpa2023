package ServiceRest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import DAO.ProfessionalDao;
import DAOimpl.ProfessionalDAOimpl;
import Model.Professional;

import java.util.List;

@Path("/professional")
public class ResourceProfessional {
    private ProfessionalDao professionalDao = new ProfessionalDAOimpl();

    @GET
    @Path("/{professionalId}")
    @Produces("application/json")
    public Response getProfessional(@PathParam("professionalId") Long professionalId, List<Professional> lp) {
        Professional pro = professionalDao.getById(lp, professionalId);
        if (pro != null) {
            return Response.status(Response.Status.OK).entity(pro).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Consumes("application/json")
    public Response createProfessional(Professional pro) {
        professionalDao.createProfessional(pro);
        return Response.status(Response.Status.CREATED).build();
    }
}
