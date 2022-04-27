package com.xworkz.entity;


@Data // lombok property by default it has setter,getter(),toString(),hashCode(),equals() which helps developer to do no write those methods.
//after updating the java version we have "record" instead of lombok external software.


@Entity // to tell that which class is entity.

@Table(name = "restaurant") // to map the entity class to table.

public class RestaurantEntity {

	@Id // to tell the which is primary key.
	@Column(name = "id") // column to class member mapping(if both names are diff)
	private int restaurantId;
	@Column(name = "name") // column to class member mapping(if both names are diff)
	private String restaurantName; // not mapping coz both names i.e table column name & class member name both are same.
	private long contactNo;
	private String type;
	private double rating;
}

