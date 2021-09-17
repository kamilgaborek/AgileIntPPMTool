package kamil.gaborek.ppmtool.services;

import kamil.gaborek.ppmtool.domain.Project;
import kamil.gaborek.ppmtool.exceptions.ProjectIdentifierException;
import kamil.gaborek.ppmtool.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
            throw new ProjectIdentifierException("Project ID '" + project.getProjectIdentifier() + "' already exists!");
        }
    }

    public Project findProjectByIdentifier(String projectIdentifier){

        String projectIdentifierUppercase = projectIdentifier.toUpperCase();
        Project project = projectRepository.findByProjectIdentifier(projectIdentifierUppercase);
        if(project == null){
            throw new ProjectIdentifierException("There is no any project with identifier: "+ projectIdentifierUppercase);
        }

        return project;
    }

    public Iterable<Project> findAllProjects(){
        return projectRepository.findAll();
    }

}
