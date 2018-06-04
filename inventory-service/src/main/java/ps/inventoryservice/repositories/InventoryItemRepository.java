package ps.inventoryservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ps.inventoryservice.entities.InventoryItem;

import java.util.Optional;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long> {

    Optional<InventoryItem> findByProductCode(String productCode);
}
