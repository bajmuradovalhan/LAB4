package org.evil.service;

import org.evil.domain.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/shop")
public class JerseyRest {
    //store Furniture assortment
    private static Furniture[] furnitureData = {
            new Furniture("1", "IKEA", "Chair", "Office chair", "10",8000),
            new Furniture("2", "Ashley HomeStore", "Table", "Coffee table", "25",15000),
            new Furniture("3", "Restoration Hardware", "Chair", "Dining chair", "7",1200),
            new Furniture("4", "Kartell", "Table", "Console table", "20",17000),
            new Furniture("5", "Williams-Sonoma ", "Chair", "Chair for home", "5",7000)
    };
    // the number of products in the store
    private static int[] quantityData = {0, 2, 3, 5, 1};
    private static StoreAssortment storeAssortment = new StoreAssortment(furnitureData, quantityData);

    /**
     * // EXAMPLE POST REQUEST
     *
     * POST http://localhost:8081/RestExample/rest/shop/payment
     * Accept: application/json
     * Content-Type: application/json
     *
     * {
     *   "productId": "123",
     *   "quantity": 2
     * }
     *
     */

    @POST
    @Path("/payment")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response buyFurniture(UserOrder userOrder) {
        int size = storeAssortment.getFurnitures().length;
        for (int i = 0; i < size; i++) {
            Furniture currentFurniture = storeAssortment.getFurnitures()[i];
            if (currentFurniture.getId().equals(userOrder.getProductId())) {
                double orderPrice = currentFurniture.getPrice() * userOrder.getQuantity();
                PaymentResult goodResult = new PaymentResult(
                        currentFurniture.toString(),
                        userOrder.getQuantity(),
                        orderPrice,
                        "Buy successful!");
                return Response.ok(goodResult).build();
            }
        }
        PaymentResult badResult = new PaymentResult(
                userOrder.getProductId(),
                userOrder.getQuantity(),
                0,
                "Buy failure! Model with id = " + userOrder.getProductId() + " not found");
        return Response.ok(badResult).build();
    }

/*
    @GET
    @Path("/assortment")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStoreCatalog() {
        return Response.ok(storeAssortment).build();
    }

 */
}
