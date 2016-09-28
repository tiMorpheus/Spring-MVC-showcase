package github.tiMorpheus.dataexam.repository;

import github.tiMorpheus.dataexam.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BankRepository extends JpaRepository<Bank, Long> {

    @Query("SELECT b FROM Bank b where b.name = :name")
    Bank findByName(@Param("name") String name);
}
