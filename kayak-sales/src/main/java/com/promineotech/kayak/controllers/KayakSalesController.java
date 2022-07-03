package com.promineotech.kayak.controllers;

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
import com.promineotech.kayak.controllers.entities.Kayak;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@RequestMapping("/kayaks")
@OpenAPIDefinition(info = @Info(title = "Kayak Service"), servers = {
    @Server(url = "http://localhost:8080", description = "Local server.")})
public interface KayakSalesController {

  
  @Operation(
      summary = "Returns a list of Kayaks",
      description = "Returns a list of Kayaks given an optional brand and/or name",
      responses = {
          @ApiResponse(responseCode = "200",
             description = "A list of Kayaks is returned",
             content = @Content(
                 mediaType = "application/json",
                 schema = @Schema(implementation = Kayak.class))),
          @ApiResponse(
              responseCode = "400",
              description = "The request parameters are invalid", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "No Kayaks were found with the input criteria", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occured.", 
              content = @Content(mediaType = "application/json"))
      },
          parameters = {
              @Parameter(
                  name = "brand", 
                  allowEmptyValue = false, 
                  required = false, 
                  description = "The brand name (i.e., 'DAGGER')"),
              @Parameter(
                  name = "name", 
                  allowEmptyValue = false, 
                  required = false, 
                  description = "The name level (i.e., 'Jitsu')")
      }
  )

  // Read
@GetMapping
@ResponseStatus(code = HttpStatus.OK)
List<Kayak> fetchKayaks(
@RequestParam(required = false)
    String kayakId, 
@RequestParam(required = false)
    String name);
//@formatter:on
  
 
  @Operation(
      summary = "Creates a Kayak",
      description = "Create a kayak using a required kayak, kayak brand and kayak name",
      responses = {
          @ApiResponse(
              responseCode = "200", 
              description = "A kayak is created", 
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
              description = "Unable to create a kayak with the input criteria.", 
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
              description = "The kayak Brand (i.e., 'DAGGER')"), 
          @Parameter(
              name = "kayakName",
              allowEmptyValue = false,
              required = false,
              description = "The kayak name (i.e., 'Spirit')"),
          @Parameter(
              name = "kayakCost",
              allowEmptyValue = false,
              required = false,
              description = "The kayak cost (i.e., '399.99')"),
          @Parameter(
              name = "kayakWidth",
              allowEmptyValue = false,
              required = false,
              description = "The kayak width (i.e., '32')")
      }
  )
  
  // Create
  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  Optional<Kayak> createKayak(
      @RequestParam(required = false)
      String kayakId, 
  @RequestParam(required = false)
      String name);
    
  @Operation(
      summary = "Updates a kayak",
      description = "Update a kayak using a required kayak, kayak brand and kayak name",
      responses = {
          @ApiResponse(
              responseCode = "200", 
              description = "A kayak is created", 
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
              description = "Unable to create a kayak with the input criteria.", 
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
                  description = "The kayak Brand (i.e., 'DAGGER')"), 
              @Parameter(
                  name = "kayakName",
                  allowEmptyValue = false,
                  required = false,
                  description = "The kayak name (i.e., 'Spirit')"),
              @Parameter(
                  name = "kayakCost",
                  allowEmptyValue = false,
                  required = false,
                  description = "The kayak cost (i.e., '399.99')"),
              @Parameter(
                  name = "kayakWidth",
                  allowEmptyValue = false,
                  required = false,
                  description = "The kayak width (i.e., '32')")
      }
  )
   // Update
      @PutMapping
      @ResponseStatus(code = HttpStatus.CREATED)
      Optional<Kayak> updateKayak(
      @RequestParam(required = false)
      String kayakId, 
      @RequestParam(required = false)
      String name);

      @Operation(
          summary = "Deletes a kayak",
          description = "Delete a kayak using a required kayak, kayak brand and kayak name",
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
                  description = "The kayak Brand (i.e., 'DAGGER')"), 
              @Parameter(
                  name = "kayakName",
                  allowEmptyValue = false,
                  required = false,
                  description = "The kayak name (i.e., 'Spirit')"),
              @Parameter(
                  name = "kayakCost",
                  allowEmptyValue = false,
                  required = false,
                  description = "The kayak cost (i.e., '399.99')"),
              @Parameter(
                  name = "kayakWidth",
                  allowEmptyValue = false,
                  required = false,
                  description = "The kayak width (i.e., '32')") 
          }
      )
       // Delete method (Delete)
       @DeleteMapping
       @ResponseStatus(code = HttpStatus.OK)
       Optional<Kayak> deleteKayaks(
           @RequestParam(required = false)
           String kayakId, 
           @RequestParam(required = false)
           String name);


      List<Kayak> fetchKayaks(Kayak brand, String name);
       
       
     }



