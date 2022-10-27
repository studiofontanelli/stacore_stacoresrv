/**********************************************
 * CSI PIEMONTE 
 **********************************************/
package it.csi.stacore.stacoresrv.api.service;

import it.csi.stacore.stacoresrv.api.dto.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.stacore.stacoresrv.api.dto.ErrorDto;
import it.csi.stacore.stacoresrv.api.dto.ParametroApplicativoVO;

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

@Path("/parametri-applicativi")


@io.swagger.annotations.Api(description = "the parametri-applicativi API")

public interface ParametriApplicativiApi  {
   
    @GET
    @Path("/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "parametro-applicativo", notes = "get tutti i parametri operativi", response = ParametroApplicativoVO.class, responseContainer = "List", tags={ "parametro-applicativo", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ParametroApplicativoVO.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "parametri obbligatori non valorizzati", response = ErrorDto.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "nessun parametro applicativo corrispondente ai criteri di ricerca", response = ErrorDto.class),
        
        @io.swagger.annotations.ApiResponse(code = 422, message = "errore formato dati", response = ErrorDto.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error", response = ErrorDto.class) })
    public Response getParametriApplicativi(@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "parametro-applicativo", notes = "carica parametro applicativo", response = ParametroApplicativoVO.class, tags={ "parametro-applicativo", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ParametroApplicativoVO.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "parametri obbligatori non valorizzati", response = ErrorDto.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "nessun parametro applicativo corrispondente ai criteri di ricerca", response = ErrorDto.class),
        
        @io.swagger.annotations.ApiResponse(code = 422, message = "errore formato dati", response = ErrorDto.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error", response = ErrorDto.class) })
    public Response getParametroApplicativo( @PathParam("id") String id,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
