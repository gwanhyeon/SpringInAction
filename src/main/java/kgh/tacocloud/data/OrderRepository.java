package kgh.tacocloud.data;

import kgh.tacocloud.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
//    Order save(Order order);
    List<Order> findByDeliveryZip(String deliveryZip);
}

