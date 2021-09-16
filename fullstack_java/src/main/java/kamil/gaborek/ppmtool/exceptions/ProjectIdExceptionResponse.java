package kamil.gaborek.ppmtool.exceptions;

public class ProjectIdExceptionResponse {

    private String projectIdetntifier;

    public ProjectIdExceptionResponse(String projectIdetntifier) {
        this.projectIdetntifier = projectIdetntifier;
    }

    public String getProjectIdetntifier() {
        return projectIdetntifier;
    }

    public void setProjectIdetntifier(String projectIdetntifier) {
        this.projectIdetntifier = projectIdetntifier;
    }
}
