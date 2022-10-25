/**********************************************
 * CSI PIEMONTE 
 **********************************************/
package it.csi.stacore.stacoresrv.api.service;

import it.csi.stacore.stacoresrv.api.dto.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.stacore.stacoresrv.api.dto.Comune;
import it.csi.stacore.stacoresrv.api.dto.ErrorDto;
import it.csi.stacore.stacoresrv.api.dto.SearchComuneRequest;

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

@Path("/comune")


@io.swagger.annotations.Api(description = "the comune API")

public interface ComuneApi  {
   
    @POST
    @Path("/_search")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Ricerca i comuni secondo i parametri di. ", response = Comune.class, responseContainer = "List", tags={ "comune", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Comune.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 422, message = "request non valorizzata ", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error ", response = ErrorDto.class) })
    public Response findComune(@ApiParam(value = "I parametri di ricerca del comune " ,required=true) SearchComuneRequest request,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Questa risorsa rappresenta il comune identificato con il suo ID. ", response = Comune.class, tags={ "comune", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Comune.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parametro non valorizzato", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Comune non trovato", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error", response = ErrorDto.class) })
    public Response getComuneById( @PathParam("id") Long id,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Questa risorsa rappresenta il comune identificato con il suo codice ISTAT. ", response = Comune.class, tags={ "comune", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Comune.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Comune non trovato ", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 422, message = "istat non valorizzato ", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error ", response = ErrorDto.class) })
    public Response getComuneByIstat( @NotNull @QueryParam("istat") String istat,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
