// package api;




// import java.io.IOException;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

// import org.testng.Assert;
// import org.testng.annotations.BeforeClass;
// import org.testng.annotations.Test;

// import api.pojo.Address;
// import api.pojo.Customer;
// import api.pojo.Product;
// import api.pojo.Purchase;
// import api.pojo.Store;

// public class StoreTests {
//      private static Store store;

//     @BeforeClass
//     public static void setup() throws IOException {
//         store = JsonLoader.loadStoreData("path/to/storeData.json");
//     }

//     @Test
//     public void validateStoreName() {
//         assertNotNull("Store name should not be null", store.getName());
//     }

//     @Test
//     public void validateAddressFields() {
//         Address address = new Address();
       
//         Assert.assertNotNull("Address should not be null", address.getCountry());
//         Assert.assertNotNull("Street should not be null", address.getStreet());
//         Assert.assertNotNull("City should not be null", address.getCity());
//         Assert.assertNotNull("State should not be null", address.getState());
//         Assert.assertNotNull("Zip should not be null", address.getZip());
//         Assert.assertNotNull("Country should not be null", address.getCountry());
//     }

//     @Test
//     public void ensureUniqueProductIds() {
//         List<Product> products = ((Object) store).getProducts();
//         Set<String> productIds = new HashSet<>();
//         for (Product product : products) {
//             assertTrue("Duplicate product_id found", productIds.add(product.getProduct_id()));
//         }
//     }

//     @Test
//     public void verifyPurchaseHistoryTotalAmount() {
//         for (Customer customer : store.getCustomers()) {
//             for (Purchase purchase : customer.getPurchase_history()) {
//                 double totalAmount = purchase.getTotal_amount();
//                 double calculatedTotal = purchase.getItems().stream()
//                         .mapToDouble(item -> item.getPrice() * item.getQuantity())
//                         .sum();
//                 assertEquals("Total amount should match sum of item prices", totalAmount, calculatedTotal, 0.01);
//             }
//         }
//     }

//     @Test
//     public void ensureOrderCustomerIdExistsInCustomers() {
//         Set<String> customerIds = new HashSet<>();
//         store.getCustomers().forEach(c -> customerIds.add(c.getCustomer_id()));
        
//         store.getOrders().forEach(order -> 
//             assertTrue("Order customer ID should exist in customers array", customerIds.contains(order.getCustomer_id()))
//         );
//     }
// }
