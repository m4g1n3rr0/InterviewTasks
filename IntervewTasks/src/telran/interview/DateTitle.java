package telran.interview;

import java.time.LocalDate;
import java.util.Objects;


public class DateTitle {
		
	LocalDate date;
	String title;

		
	public DateTitle(LocalDate date, String title) {
		
		this.date = date;
		this.title = getTitle();
		   
	}

	    public String getTitle() {
	        
	    	if (title != null) {}
	    	
	    	return title;
	    
	    }
	
	  @Override
	  public boolean equals(Object obj) {
	       
		  if (this == obj) {return true;}
		  if (obj == null || getClass() != obj.getClass()) {return false;} 
		  DateTitle dateTitle = (DateTitle) obj;
		  return Objects.equals(date, dateTitle.date) && Objects.equals(title, dateTitle.title);
	  
	  }

	    @Override
	    public int hashCode() {
	        
	    	return Objects.hash(date, title);
	   
	    }
	    
	    @Override
	    public String toString() {
	        return "DateTitle{" +
	                "date=" + date +
	                ", title='" + title + '\'' +
	                '}';
	    }

}
