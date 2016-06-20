package com.x.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TABLE_ACCOUNT")
public class AccountModel
{
	
		// ==============
		// PRIVATE FIELDS
		// ==============
		// An autogenerated id (unique for each user in the db)
		
		@Id
		@GeneratedValue(generator = "uuid")
	    @GenericGenerator(name = "uuid", strategy = "uuid")
	 	private java.lang.String id;
		
		/**
		 * 账户
		 */
		@NotNull
		@Column(name = "ACCOUNT", unique = true, nullable = false, updatable = false)
	    private String account;
		
		/**
		 * 创建时间
		 */
		private java.sql.Timestamp time ;
		
		
	    
	    public AccountModel() { ; }

	    public AccountModel(String account)
	    {
	        this.account = account;
	    }
	    


		public void setId( java.lang.String id)
	    {
	    	this.id = id ;
	    }
	    
	    public void setAccount( String account)
	    {
	    	this.account = account ;
	    }
	    
	    public java.lang.String getId() 
	    {
	        return id;
	    }

	    public String getAccount() 
	    {
	        return account;
	    }

		public java.sql.Timestamp getTime() 
		{
			return time;
		}

		public void setTime(java.sql.Timestamp time) 
		{
			this.time = time;
		}
	    
	    
}