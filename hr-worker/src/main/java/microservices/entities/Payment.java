package microservices.entities;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Payment implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private String name;
	private Double dailyIncome;
	private Integer days;
	private Double total;

}
