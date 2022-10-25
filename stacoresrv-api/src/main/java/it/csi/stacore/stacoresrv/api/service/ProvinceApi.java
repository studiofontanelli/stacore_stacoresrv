/**********************************************
 * CSI PIEMONTE 
 **********************************************/
package it.csi.stacore.stacoresrv.api.service;

import it.csi.stacore.stacoresrv.api.dto.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.stacore.stacoresrv.api.dto.ErrorDto;
import it.csi.stacore.stacoresrv.api.dto.Provincia;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/province")


@io.swagger.annotations.Api(description = "the province API")

public interface ProvinceApi  {
   
    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Ricerca le nazioni secondo i parametri di ricerca passati. ", response = Provincia.class, responseContainer = "List", tags={ "province", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Provincia.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 422, message = "request non valorizzata ", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error ", response = ErrorDto.class) })
    public Response findProvince( @QueryParam("search_type") String searchType,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
