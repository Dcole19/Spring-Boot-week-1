package com.promineotech.kayak.controllers;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
@OpenAPIDefinition(info = @Info(title = "Kayak Controller"),
servers = {
    @Server(url = "http://localhost:8080", description = "Local server")
})
public interface kayakcontroller {

  @Operation(
      summary = "Show all kayaks",
      description = "Returns all kayaks",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "A list of kayaks is returned",
              content = @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = Kayak.class))),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid request",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404",
              description = "no kayaks were found",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500",
              description = "An unplanned error occured",
              content = @Content(
                  mediaType = "application/json"))
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
               description = "The name of the kayak (i.e., 'AXIS')")
        })
      
    @GetMapping // Read
    @ResponseStatus(code = HttpStatus.OK)
          List<Kayak> fetchKayak(
              @RequestParam(required = false)
              Kayak kayak_id,
              @RequestParam(required = false)
              String brand_Id);
          
  @Operation(
      summary = "Show all kayaks",
      description = "Returns all kayaks",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "A kayak is updated",
              content = @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = Kayak.class))),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid request",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404",
              description = "no kayaks were updated",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500",
              description = "An unplanned error occured",
              content = @Content(
                  mediaType = "application/json"))
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
               description = "The name of the kayak (i.e., 'AXIS')")
        })
      
    @PutMapping // Update
    @ResponseStatus(code = HttpStatus.OK)
          List<Kayak> updateKayak(
              @RequestParam(required = false)
              Kayak kayak_id,
              @RequestParam(required = false)
              String brand_Id);
          
  @Operation(
      summary = "Show all kayaks",
      description = "Returns all kayaks",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "A kayak is created",
              content = @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = Kayak.class))),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid request",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404",
              description = "no kayaks were created",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500",
              description = "An unplanned error occured",
              content = @Content(
                  mediaType = "application/json"))
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
               description = "The name of the kayak (i.e., 'AXIS')")
        })
      
    @PostMapping // Create
    @ResponseStatus(code = HttpStatus.OK)
          List<Kayak> createKayak(
              @RequestParam(required = false)
              Kayak kayak_id,
              @RequestParam(required = false)
              String brand_Id);
          
  
  @Operation(
      summary = "Show all kayaks",
      description = "Returns all kayaks",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "A kayak was deleted",
              content = @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = Kayak.class))),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid request",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404",
              description = "no kayaks were deleted",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500",
              description = "An unplanned error occured",
              content = @Content(
                  mediaType = "aoolication/json"))
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
               description = "The name of the kayak (i.e., 'AXIS')")
        })
      
    @DeleteMapping // delete
    @ResponseStatus(code = HttpStatus.OK)
          List<Kayak> deleteKayak(
              @RequestParam(required = false)
              Kayak kayak_id,
              @RequestParam(required = false)
              String brand_Id);
          
  
      
      }
      

