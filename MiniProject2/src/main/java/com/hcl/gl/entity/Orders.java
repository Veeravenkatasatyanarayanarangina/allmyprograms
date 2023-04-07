package com.hcl.gl.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "oderstable")
public class Orders 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderId;

	@OneToMany(targetEntity = FoodItems.class, cascade = CascadeType.ALL)
	@JoinColumn(name="itemsId",referencedColumnName="userid")

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "billId", referencedColumnName = "userid")

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
}
