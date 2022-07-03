package Controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import Entity.Kayak;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.media.Schema;

@Validated
@RequestMapping("/Kayaks") 
@OpenAPIDefinition(info = @Info(title = "Kayak Service"), servers = {
    @Server(url = "http://localhost:8080", description = "Local server.")})

public interface KayakController {
//@formatter:off
  @Operation(
      summary = "Returns a list of kayaks",
      description = "Returns a list of kayaks given a required kayak brand and name",
      responses = {
          @ApiResponse(
              responseCode = "200", 
              description = "A list of kayaks is returned.", 
              content = @Content(
                  mediaType = "application/json", 
              schema = @Schema(implementation = Kayak.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "The request parameters are invalid.", 
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "No kayaks were found with the input criteria.", 
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred.", 
              content = @Content(
                  mediaType = "application/json"))
      },
      parameters = {
          @Parameter(
              name = "kayakId", 
              allowEmptyValue = false, 
              required = false, 
              description = "The kayak brand (i.e., 'PELICAN')"), 
          @Parameter(
              name = "kayakName",
              allowEmptyValue = false,
              required = false,
              description = "The kayak name (i.e., 'MAXIM 100X')") 
     }
  )
  
  //Get method (Read) 
  @GetMapping
  @ResponseStatus(code = HttpStatus.OK)
  List<Kayak> fetchKayaks(
      @RequestParam(required = false) 
      String kayakId,
      @RequestParam(required = false)
      Kayak kayakBrand);
 
  @Operation(
      summary = "Creates a kayak",
      description = "Create a kayak using a brand and name",
      responses = {
          @ApiResponse(
              responseCode = "200", 
              description = "A kayak is created!", 
              content = @Content(
                  mediaType = "application/json", 
              schema = @Schema(implementation = Kayak.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "The request parameters are invalid.", 
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "Unable to create kayak with the input criteria.", 
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred.", 
              content = @Content(
                  mediaType = "application/json"))
      },
      parameters = {
          @Parameter(
              name = "kayakId", 
              allowEmptyValue = false, 
              required = false, 
              description = "The kayak id (i.e., '32')"), 
          @Parameter(
              name = "kayakBrand",
              allowEmptyValue = false,
              required = false,
              description = "The kayak brand (i.e., 'PELICAN')"),
          @Parameter(
              name = "kayakName",
              allowEmptyValue = false,
              required = false,
              description = "The kayak name (i.e., 'AXIM 100X')")
      }
  )
  
  // Post method (Create)
  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  Optional<Kayak> createKayaks(
     @RequestParam(required = false) 
     String kayakId,
     @RequestParam(required = false)
     Kayak kayakBrand,
     @RequestParam(required = false)
     Kayak kayakName);  
  
  @Operation(
      summary = "Updates a kayak",
      description = "Update a kayak using a brand and name",
      responses = {
          @ApiResponse(
              responseCode = "200", 
              description = "A kayak is updated!", 
              content = @Content(
                  mediaType = "application/json", 
              schema = @Schema(implementation = Kayak.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "The request parameters are invalid.", 
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "Unable to update kayak with the input criteria.", 
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred.", 
              content = @Content(
                  mediaType = "application/json"))
      },
      parameters = {
          @Parameter(
              name = "kayakId", 
              allowEmptyValue = false, 
              required = false, 
              description = "The kayak id (i.e., '32')"), 
          @Parameter(
              name = "kayakBrand",
              allowEmptyValue = false,
              required = false,
              description = "The kayak brand (i.e., 'PELICAN')"),
          @Parameter(
              name = "kayakName",
              allowEmptyValue = false,
              required = false,
              description = "The kayak name (i.e., 'AXIM 100X')")
      }
  )
  
  // Put method (Update)
 @PutMapping
 @ResponseStatus(code = HttpStatus.OK)
 Optional<Kayak> updatekayaks(
     @RequestParam(required = false) 
     String kayakId,
     @RequestParam(required = false)
     Kayak kayakBrand,
     @RequestParam(required = false)
     Kayak newKayakName);
  
 @Operation(
     summary = "Deletes a kayak",
     description = "Delete a kayak given a brand and name",
     responses = {
         @ApiResponse(
             responseCode = "200", 
             description = "A kayak is deleted.", 
             content = @Content(
                 mediaType = "application/json", 
             schema = @Schema(implementation = Kayak.class))),
         @ApiResponse(
             responseCode = "400", 
             description = "The request parameters are invalid.", 
             content = @Content(
                 mediaType = "application/json")),
         @ApiResponse(
             responseCode = "404", 
             description = "No kayaks were found with the input criteria.", 
             content = @Content(
                 mediaType = "application/json")),
         @ApiResponse(
             responseCode = "500", 
             description = "An unplanned error occurred.", 
             content = @Content(
                 mediaType = "application/json"))
     },
     parameters = {
         @Parameter(
             name = "kayakId", 
             allowEmptyValue = false, 
             required = false, 
             description = "The kayak id (i.e., '32')"), 
         @Parameter(
             name = "kayakBrand",
             allowEmptyValue = false,
             required = false,
             description = "The kayak brand (i.e., 'PELICAN')") 
     }
 )
  // Delete method (Delete)
  @DeleteMapping
  @ResponseStatus(code = HttpStatus.OK)
  Optional<Kayak> deleteKayaks(
      @RequestParam(required = false) 
      String kayakId,
      @RequestParam(required = false)
      Kayak kayakBrand);
  
  //@formatter:on
}