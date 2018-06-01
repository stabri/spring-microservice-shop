package ps.microservisesshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ps.microservisesshop.entities.Product;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findByCode(String code);
}
