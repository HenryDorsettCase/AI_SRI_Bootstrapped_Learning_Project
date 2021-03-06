/**
 * PDDL Graph Planner
 * Zeyn Saigol <zeyn@zeyn.net>
 * School of Computer Science
 * University of Birmingham
 *
 * $Id: PDDLSyntaxException.java 33 2007-02-23 15:45:34Z zas $
 */
package edu.usu.cs.pddl.parser;

/**
 * Exception thrown when the syntax of the supplied PDDL file does not conform
 * to the PDDL 3.0 grammar.
 */
public class PDDLSyntaxException extends Exception
{
	private static final long serialVersionUID = 2131714624036837144L;

	public PDDLSyntaxException()
    {
        super();
    }

    public PDDLSyntaxException(String message)
    {
        super(message);
    }

    public PDDLSyntaxException(Throwable cause)
    {
        super(cause);
    }

    public PDDLSyntaxException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
