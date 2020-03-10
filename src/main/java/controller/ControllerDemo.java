package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javatpoint.bean.Student;
import com.javatpoint.bean.StudentDao;



@Controller
public class ControllerDemo {
	ApplicationContext app=new ClassPathXmlApplicationContext("Application.xml");
	@RequestMapping("/home")
	public String view()
	{
		return "home";
	}
	@RequestMapping("/register")
	public String view1(Model m)
	{
		Student obj=app.getBean("info",Student.class);
		m.addAttribute("bean",obj);
		return "register";
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String view2(@ModelAttribute("bean") Student ob)
	{
		StudentDao obj=app.getBean("dao",StudentDao.class);
		obj.save(ob);
		return "home";
	}
}
