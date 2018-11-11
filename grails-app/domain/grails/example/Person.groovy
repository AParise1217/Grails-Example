package grails.example

/**
 * <h1>Person</h1>
 * <p>Simple Domain Model to Exemplify Grails Behavior</p>
 *
 * @author  Andrew Parise <andrewparise1994@gmail.com>
 * @since   11 November 2018
 */
class Person {

    String firstName

    String lastName

    Date dateOfBirth

    static constraints = {
        firstName   (blank: false)
        lastName    (blank: false)
        dateOfBirth (blank: false)
    }

}
