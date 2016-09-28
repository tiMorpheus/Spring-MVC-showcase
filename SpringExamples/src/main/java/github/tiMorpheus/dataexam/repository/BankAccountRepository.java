package github.tiMorpheus.dataexam.repository;

import github.tiMorpheus.dataexam.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
