/**********************************************
 * CSI PIEMONTE 
 **********************************************/
package it.csi.stacore.stacoresrv.api.service;

import it.csi.stacore.stacoresrv.api.dto.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.stacore.stacoresrv.api.dto.DecodificaVO;
import it.csi.stacore.stacoresrv.api.dto.ErrorDto;

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

@Path("/decodifiche")


@io.swagger.annotations.Api(description = "the decodifiche API")

public interface DecodificheApi  {
   
    @GET
    @Path("/tipi-veicolo/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "decodifica", notes = "ricerca lista tipo veicolo.", response = DecodificaVO.class, responseContainer = "List", tags={ "decodifica", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DecodificaVO.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "parametri obbligatori non valorizzati", response = ErrorDto.class),
        
        @io.swagger.annotations.ApiResponse(code = 422, message = "errore formato dati", response = ErrorDto.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error", response = ErrorDto.class) })
    public Response findTipoVeicolo(@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
