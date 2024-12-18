package productcrudapp.dao;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import productcrudapp.model.Form;

@Component
public class FormDao {
    
	@Autowired
	 private  HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createForm(Form form)
	{
		this.hibernateTemplate.save(form);
	}

	public List<Form> findAll() {
		
		return this.hibernateTemplate.loadAll(Form.class);
	}

	
	

	
}
