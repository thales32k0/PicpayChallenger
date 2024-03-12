package thales.dev.demo.user.transactions;

import java.math.BigDecimal;

public record TransactionDTO(

        BigDecimal amount,
        Long payerId,
        Long payeeId
) {

}

