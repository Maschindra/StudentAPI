package com.maschindra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * @Table and @column is not mandatory 
 * @Table is used to modify table properties in database like also @Column 
 * is used to modify table column in table like name 
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/*
 * lombok is a tool that is used to remove  boiler Plate code(repeated lines of code in a program like getter and setter)
 * and provide through annotations
 * @Data annotations gives us getter and setter and also overrridden toString and hascode method 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student_info")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/*
	 * nullable is used to provide constraints for a column in a table
	 */
	@Column(nullable = false)
	private String name;
	
	private Integer totalMarks;

}
