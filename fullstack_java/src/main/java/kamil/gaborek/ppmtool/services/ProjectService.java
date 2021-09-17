package kamil.gaborek.ppmtool.services;

import kamil.gaborek.ppmtool.domain.Project;
import kamil.gaborek.ppmtool.exceptions.ProjectIdException;
import kamil.gaborek.ppmtool.exceptions.ProjectIdetifierException;
import kamil.gaborek.ppmtool.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project SaveOrUpdateProject(Project project) {
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        } catch (Exception ex) {
            throw new ProjectIdetifierException("Project ID '" + project.getProjectIdentifier() + "' already exists!");
        }
    }

}
