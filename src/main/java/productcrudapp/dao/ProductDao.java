//package productcrudapp.dao;
//
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.orm.hibernate5.HibernateTemplate;
//import org.springframework.stereotype.Component;
//
//import productcrudapp.model.Product;
//
//@Component
//public class ProductDao {
//	
//	@Autowired
//	private HibernateTemplate hibernateTemplate;
//	
//	
//	@Transactional
//	public void createProduct(Product product) {
//		this.hibernateTemplate.save(product);
//	}
//	
//	
//	public List<Product> getProducts(){
//		List<Product> p =this.hibernateTemplate.loadAll(Product.class);
//		return p;
//	}
//	
//	@Transactional
//	public void deleteProduct(int pId) {
//		Product product = this.hibernateTemplate.load(Product.class, pId);
//		this.hibernateTemplate.delete(product);
//	}
//	
//	public Product getProduct(int pId) {
//		return this.hibernateTemplate.get(Product.class, pId);
//	}
//
//}
