package asp4j.solver.object;

import asp4j.lang.AnswerSet;
import asp4j.program.Program;
import asp4j.solver.ReasoningMode;
import java.util.List;
import java.util.Set;

/**
 *
 * @author hbeck May 19, 2013
 */
public interface ObjectSolver {

    /**
     * list of answer sets in order as reported by the solver
     *
     * @param program
     * @return answer sets
     * @throws Exception
     */
    List<AnswerSet<Object>> getAnswerSets(Program<?> program, Binding binding) throws Exception;
    
    List<AnswerSet<Object>> getAnswerSets(Program<?> program, Binding binding, Filter filter) throws Exception;

     /**
     * derive logical consequence of a program and return the objects of the bound classes
     * 
     * @param program
     * @param binding output classes
     * @param mode BRAVE reports atoms (objects) found in any answer set, CAUTIOUS those found in all answer sets
     * @return logical consequence by means of the answer set semantics, filtered and instatiated due to binding
     * @throws Exception 
     */
    Set<Object> getConsequence(Program<?> program, Binding binding, ReasoningMode mode) throws Exception;
    
    /**
     * 
     * @param program
     * @param binding
     * @param mode
     * @param filter
     * @return
     * @throws Exception 
     */
    Set<Object> getConsequence(Program<?> program, Binding binding, ReasoningMode mode, Filter filter) throws Exception;
    
}
