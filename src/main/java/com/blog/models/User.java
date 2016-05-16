package com.blog.models;

/**
 * User model
 */
public class User {
	public User() {

	}

	/**
	 *
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 *
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	private long id;
	private String name;
}
