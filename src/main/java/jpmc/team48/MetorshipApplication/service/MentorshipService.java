package jpmc.team48.MetorshipApplication.service;

import jpmc.team48.MetorshipApplication.objects.people.Mentor;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorshipService extends CrudRepository<Mentor, Long> {


}
