package app.book.entities.inheritanceexamples.tablepersubclass;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Created by ajoshi on 01-Oct-16.
 */
@NoArgsConstructor
@Data
@Entity
@PrimaryKeyJoinColumn(name = "BANK_ACCOUNT_ID")
@Table(name = "BANK_ACCOUNT")
public class BankAccount extends BillingDetails {
    @Column(name = "ACCOUNT", nullable = false)
    private String account;
}
