package kamil.gaborek.ppmtool.exceptions;

public class ProjectIdentifierExceptionResponse {

    private String projectIdentifer;

    public ProjectIdentifierExceptionResponse( String exceptionMessage){
        projectIdentifer = exceptionMessage;
    }

    public void setProjectIdentifer(String projectIdentifer){
        this.projectIdentifer = projectIdentifer;
    }

    public String getProjectIdentifer(){
        return projectIdentifer;
    }
}
