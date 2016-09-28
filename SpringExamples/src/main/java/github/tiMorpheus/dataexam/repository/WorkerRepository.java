package github.tiMorpheus.dataexam.repository;

import github.tiMorpheus.dataexam.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
