package jpmc.team48.MetorshipApplication.controller;

import jpmc.team48.MetorshipApplication.objects.people.Mentor;
import jpmc.team48.MetorshipApplication.service.MentorshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/mentor/")
public class MentorshipController {
    @Autowired
    private MentorshipService mentorshipService;


        @GetMapping("{id}")
        public Optional<Mentor> findById(@PathVariable Long id){
            return mentorshipService.findById(id);
        }

        @GetMapping("")
        public Object findAll(){
            return mentorshipService.findAll();
        }

        @PostMapping("")
        public Object save(@RequestBody Mentor mentor){
            return mentorshipService.save(mentor);
        }

    @DeleteMapping("{id}")
    public Optional<Mentor> deleteById(@PathVariable Long id){
        mentorshipService.deleteById(id);
        return null;
    }

    @PutMapping("{id}")
    public Optional<Mentor> updateById(@RequestBody Mentor mentor, @PathVariable Long id){
            if(mentor.getId().equals(id)) {
                mentorshipService.save(mentor);
            }

            return null;
    }

}
