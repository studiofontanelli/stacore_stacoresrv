/**********************************************
 * CSI PIEMONTE 
 **********************************************/
package it.csi.stacore.stacoresrv.api.service;

import it.csi.stacore.stacoresrv.api.dto.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.stacore.stacoresrv.api.dto.DatiCalcoloRimborsoNonGodutoVO;
import it.csi.stacore.stacoresrv.api.dto.ErrorDto;
import it.csi.stacore.stacoresrv.api.dto.EsitoCalcoloRimborsoNonGodutoVO;

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

@Path("/rimborsi-non-goduti")


@io.swagger.annotations.Api(description = "the rimborsi-non-goduti API")

public interface RimborsiNonGodutiApi  {
   
    @POST
    @Path("/calcola")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Effettua il calcolo del rimborso non goduto ", response = EsitoCalcoloRimborsoNonGodutoVO.class, tags={ "rimborsi", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = EsitoCalcoloRimborsoNonGodutoVO.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parametro non valorizzato", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error", response = ErrorDto.class) })
    public Response calcolaRimborsoNonGoduto(@ApiParam(value = "I dati calcolo per effettuare il rimborso non goduto " ,required=true) DatiCalcoloRimborsoNonGodutoVO datiCalcolo,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
