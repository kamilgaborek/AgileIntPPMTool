package kamil.gaborek.ppmtool.web;


import kamil.gaborek.ppmtool.domain.Project;
import kamil.gaborek.ppmtool.services.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    private ProjectService projectService;

    public ProjectController( ProjectService projectService){
        this.projectService = projectService;
    }

    @PostMapping
    public ResponseEntity<Project> createNewProject(@RequestBody Project project){

        Project project1 = projectService.SaveOrUpdateProject(project);
        return new ResponseEntity<Project>(project, HttpStatus.CREATED);
    }
}
