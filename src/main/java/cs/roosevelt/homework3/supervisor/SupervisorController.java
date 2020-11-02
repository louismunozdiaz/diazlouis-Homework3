package cs.roosevelt.homework3.supervisor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SupervisorController {
    @Autowired
    SupervisorService supervisorService;

    /**
     * Endpoint 6.
     *
     * @param sid
     * @return
     */
    @GetMapping(value = {"/supervisors", "/supervisors/{sid}"})
    public List<Supervisor> getSupervisors(@PathVariable(required = false) Optional<Integer> sid) {
        return supervisorService.getSupervisors(sid);
    }

    @GetMapping(value = {"/supervisors/list"})
    public void  getSupervisorsSid() {
        supervisorService.getSupervisorsSid();
    }
}
