package projecttracker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projecttracker.dao.ProjectRepositoryDAO;
import projecttracker.model.Project;
import projecttracker.model.ProjectStatus;

@Service
public class ProjectService {
   
	@Autowired
	ProjectRepositoryDAO projectDao;
	
    List<Project>  lstProjects = new ArrayList<Project>();
   
	
	public ProjectStatus findByProjectStatus(long projectID) {
		
		return projectDao.findByProjectStatus(projectID);
	}

	public List<Project> findByTasks(long projectId) {
		return projectDao.findByTasks(projectId);
	}

	public List<Project> findByProjectLocation(String loc) {
		return projectDao.findByProjectLocation(loc);
	}

	
	public Project findProjectById(long id) {
		return projectDao.findProjectById(id);
	}
    
	
}
