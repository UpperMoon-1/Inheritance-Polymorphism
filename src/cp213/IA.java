package cp213;

/**
 * Inherited class in simple example of inheritance / polymorphism.
 *
 * @author Giuseppe Akbari
 * @version 2024-10-28
 */
public class IA extends Student {

	// your code here
	private String course = null;
	// private String ID = null;

	/**
	 * Student constructor
	 *
	 * @param lastName  IA last name (surname): defined in Person
	 * @param firstName IA first name (given name): defined in Person
	 * @param id        IA id number
	 * @param course    IA course
	 */
	public IA(final String lastName, final String firstName, final String id, final String course) {
		super(lastName, firstName, id);
		this.course = course;

	}

	/**
	 * Getter for course.
	 *
	 * @return this.course
	 */
	public String getCourse() {
		return this.course;
	}

	/**
	 * Creates formatted string version of IA.
	 */
	@Override
	public String toString() {
		return (super.toString() + "\nCourse: " + this.course);
	}

}
