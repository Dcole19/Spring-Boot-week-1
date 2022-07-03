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
import com.promineotech.kayak.controllers.entities.Customers;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@OpenAPIDefinition(info = @Info(title = "customer Controller"),
servers = {
    @Server(url = "http://localhost:8080", description = "Local server")
})
public interface CustomerController {

  @Operation(
      summary = "Show all customers",
      description = "Returns all customers",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "A list of customers is returned",
              content = @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = Customers.class))),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid request",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404",
              description = "no customers were found",
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
               name = "customer first_Name",
               allowEmptyValue = false,
               required = false,
               description = "The customer first name (i.e., 'Indiana')"),
           @Parameter(
               name = "customer last_Name",
               allowEmptyValue = false,
               required = false,
               description = "The last name of the customer (i.e., 'Jones')")
        })
      
    @GetMapping // Read
    @ResponseStatus(code = HttpStatus.OK)
          List<Customers> fetchcustomer(
              @RequestParam(required = false)
              Customers first_name,
              @RequestParam(required = false)
              String last_name);
          
  @Operation(
      summary = "Show all customers",
      description = "Returns all customers",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "A customer is updated",
              content = @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = Customers.class))),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid request",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404",
              description = "no customers were updated",
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
                  name = "customer first_Name",
                  allowEmptyValue = false,
                  required = false,
                  description = "The customer first name (i.e., 'Indiana')"),
              @Parameter(
                  name = "customer last_Name",
                  allowEmptyValue = false,
                  required = false,
                  description = "The last name of the customer (i.e., 'Jones')")
        })
      
    @PutMapping // Update
    @ResponseStatus(code = HttpStatus.OK)
          List<Customers> updatecustomer(
              @RequestParam(required = false)
              Customers first_name,
              @RequestParam(required = false)
              String last_name);
          
  @Operation(
      summary = "Show all Customers",
      description = "Returns all Customers",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "A customer is created",
              content = @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = Customers.class))),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid request",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404",
              description = "no customers were created",
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
                  name = "customer first_Name",
                  allowEmptyValue = false,
                  required = false,
                  description = "The customer first name (i.e., 'Indiana')"),
              @Parameter(
                  name = "customer last_Name",
                  allowEmptyValue = false,
                  required = false,
                  description = "The last name of the customer (i.e., 'Jones')")
        })
      
    @PostMapping // Create
    @ResponseStatus(code = HttpStatus.OK)
          List<Customers> createCustomer(
              @RequestParam(required = false)
              Customers first_name,
              @RequestParam(required = false)
              String last_name);
          
  
  @Operation(
      summary = "Show all customers",
      description = "Returns all customers",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "A customer was deleted",
              content = @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = Customers.class))),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid request",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404",
              description = "no customers were deleted",
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
                  name = "customer first_Name",
                  allowEmptyValue = false,
                  required = false,
                  description = "The customer first name (i.e., 'Indiana')"),
              @Parameter(
                  name = "customer last_Name",
                  allowEmptyValue = false,
                  required = false,
                  description = "The last name of the customer (i.e., 'Jones')")
        })
      
    @DeleteMapping // delete
    @ResponseStatus(code = HttpStatus.OK)
          List<Customers> deletecustomer(
              @RequestParam(required = false)
              Customers first_name,
              @RequestParam(required = false)
              String last_name);
          
  
      
      }
      
