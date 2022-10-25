/**********************************************
 * CSI PIEMONTE 
 **********************************************/
package it.csi.stacore.stacoresrv.api.service;

import it.csi.stacore.stacoresrv.api.dto.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.stacore.stacoresrv.api.dto.ErrorDto;
import it.csi.stacore.stacoresrv.api.dto.Nazione;
import it.csi.stacore.stacoresrv.api.dto.SearchNazioneRequest;

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

@Path("/nazione")


@io.swagger.annotations.Api(description = "the nazione API")

public interface NazioneApi  {
   
    @POST
    @Path("/_search")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Ricerca le nazioni secondo i parametri di ricerca passati. ", response = Nazione.class, responseContainer = "List", tags={ "nazione", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Nazione.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 422, message = "request non valorizzata ", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error ", response = ErrorDto.class) })
    public Response findNazione(@ApiParam(value = "I parametri di ricerca della nazione " ,required=true) SearchNazioneRequest request,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Questa risorsa rappresenta la nazione identificata con il suo ID. ", response = Nazione.class, tags={ "nazione", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Nazione.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parametro non valorizzato", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Nazione non trovata", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error", response = ErrorDto.class) })
    public Response getNazioneById( @PathParam("id") Long id,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
