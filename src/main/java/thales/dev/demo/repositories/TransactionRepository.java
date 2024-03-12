package thales.dev.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import thales.dev.demo.user.transactions.Transaction;

public interface TransactionRepository extends JpaRepository <Transaction, Long>{
}
