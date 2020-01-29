package com.sripad.docker.rest.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Instantiates a new greeting.
 *
 * @param id the id
 * @param content the content
 */
@AllArgsConstructor
@Data
public class Greeting {
	
	/** The id. */
	private final long id;
	
	/** The content. */
	private final String content;
}
