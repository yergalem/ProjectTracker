package projecttracker.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projecttracker.core.CustomEntity;
import projecttracker.model.Project;
import projecttracker.model.ProjectStatus;

@Repository
public interface ProjectRepositoryDAO  extends JpaRepository<Project , Integer> {
	
  
    public Project findByProjectKeyWord(String ProjectName);

   
    public ProjectStatus findByProjectStatus( long projectID );

  
    public List<Project> findByTasks( long projectId);
    
    public List<Project> findByProjectStatus(String status);
    
    public List<Project> findByProjectLocation(String loc);
    
    public void registerProject(CustomEntity project);
    
    public Project findProjectById(long id) ;
    
}
