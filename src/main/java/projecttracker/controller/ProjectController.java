package projecttracker.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import projecttracker.service.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {
	@Autowired
	ProjectService projectService;
    
    @RequestMapping(value = "/authenticate", method = RequestMethod.POST )
    public String authenticate( HttpServletRequest request, HttpServletResponse response)  {


        return "login";
    }

   
    @RequestMapping( value = "/list{projectId}", method = RequestMethod.GET)
    public String getProjectByStatus(@PathVariable long projectId, Model model) {
    	
    	model.addAttribute("projectlst", projectService.findByTasks( projectId) );
		return "projects";
	}
}
