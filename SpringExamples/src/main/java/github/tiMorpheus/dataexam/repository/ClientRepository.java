package github.tiMorpheus.dataexam.repository;

import github.tiMorpheus.dataexam.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
