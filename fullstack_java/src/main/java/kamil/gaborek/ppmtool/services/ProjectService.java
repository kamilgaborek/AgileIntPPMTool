package kamil.gaborek.ppmtool.services;

import kamil.gaborek.ppmtool.domain.Project;
import kamil.gaborek.ppmtool.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project SaveOrUpdateProject(Project project){

        //Logic
        return projectRepository.save(project);
    }

}
