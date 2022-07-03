package com.promineotech.kayak.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.promineotech.kayak.controllers.entities.OrderRequest;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;


@OpenAPIDefinition(info = @Info(title = "Order Controller"),
servers = {
    @Server(url = "http://localhost:8080", description = "Local server")
})
public interface KayakOrderController {

  @Operation(
      summary = "Create an order for a Kayak",
      description = "Returns the ordered Kayak",
      responses = {
          @ApiResponse(responseCode = "201", 
              description = "The ordered kayak is returned", 
              content = @Content(
                  mediaType = "application/json", 
                  schema = @Schema(implementation = Order.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "The request parameters are invalid", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "A Jeep comppnent was not found with the input criteria", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occured.", 
              content = @Content(mediaType = "application/json"))
      },
          parameters = {
            @Parameter(name = "orderRequest",
                required = true,  
                description = "The order as JSON")
          }
      )
  
  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
   Order createOrder(OrderRequest orderRequest);
  
  @Operation(
      summary = "Show all kayak orders",
      description = "Returns all kayak orders",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "A kayak order was deleted",
              content = @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = Order.class))),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid request",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404",
              description = "no kayak orders were deleted",
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
    Order Order(OrderRequest orderRequest);

}
