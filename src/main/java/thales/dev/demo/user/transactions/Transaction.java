package thales.dev.demo.user.transactions;

import jakarta.persistence.*;
import lombok.*;
import thales.dev.demo.user.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SuppressWarnings("JpaAttributeTypeInspection")
@Entity(name = "transaction")
@Table(name = "transaction")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "payer_id")
    private User payer;

    @ManyToOne
    @JoinColumn(name = "payee_id")
    private User payee;

    private LocalDateTime transactionTime;

}
