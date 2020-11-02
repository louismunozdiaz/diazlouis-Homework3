package cs.roosevelt.homework3.supervisor;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SupervisorRepository extends CrudRepository<Supervisor, Integer> {
    /* Endpoint 6. */
    List<Supervisor> findBySid(int sid);

    @Query(value = "SELECT * FROM SUPERVISORS ORDER BY SID", nativeQuery = true)
    Iterable<Supervisor> getAllSid();
}
