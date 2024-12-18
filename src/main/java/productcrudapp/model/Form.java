package productcrudapp.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String email;

    private String primaryNo;
    private String alternativeNo;

    //private  String imagePaths;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrimaryNo() {
        return primaryNo;
    }

    public void setPrimaryNo(String primaryNo) {
        this.primaryNo = primaryNo;
    }

    public String getAlternativeNo() {
        return alternativeNo;
    }

    public void setAlternativeNo(String alternativeNo) {
        this.alternativeNo = alternativeNo;
    }

//    public String getImagePath() {
//        return imagePaths;
//    }
//
//    public void setImagePath(String imagePaths) {
//    	this.imagePaths=imagePaths;
//    }

    @Override
    public String toString() {
        return "Form [id=" + id + ", name=" + name + ", email=" + email + 
               ", primaryNo=" + primaryNo + ", alternativeNo=" + alternativeNo +
               "]";
    }

	
	
}
