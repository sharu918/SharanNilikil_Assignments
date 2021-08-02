package assignment05.Annotations.required;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	 private Integer age;
	   private String name;

	@Required
	   public void setAge(Integer age) {
	      this.age = age;
	   }
	   public Integer getAge() {
	      return age;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      return name;
	   }
}
