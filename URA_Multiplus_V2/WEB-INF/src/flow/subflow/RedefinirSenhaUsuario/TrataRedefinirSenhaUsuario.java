package flow.subflow.RedefinirSenhaUsuario;

/**
 * The Data class handles many types of server-side operations including data
 * collection (from a data sources such as a database, or web service), variable
 * assignments and operations (like copying variable values, performing mathematic
 * operations, and collection iteration), conditional evaluation to control callflow
 * execution based on variable values, and logging/tracing statements.
 * 
 * Items created in the getDataActions() method are executed/evaluated in order
 * and if a condional branch condition evaluates to "true" then the branch is
 * activated and the execution of data actions is halted.  If no "true" conditions
 * are encountered, then all data actions will be executed/evaluated and the 
 * application will proceed to the "Default" servlet.
 * Last generated by Orchestration Designer at: 2016-APR-29  09:38:37 PM
 */
public class TrataRedefinirSenhaUsuario extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2016-APR-29  09:38:37 PM
	 */
	public TrataRedefinirSenhaUsuario() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 3 DE MAIO DE 2016 17H37MIN12S BRT
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = null;
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 3 DE MAIO DE 2016 17H37MIN12S BRT
	 */
	public java.util.Collection<VariableInfo> getLocalVariables(){
		java.util.Collection<VariableInfo> variables = new java.util.ArrayList<VariableInfo>();

		return variables;
	}
	/**
	 * Creates and conditionally executes operations that have been configured
	 * in the Callflow.  This method will build a collection of operations and
	 * have the framework execute the operations by calling evaluateActions().
	 * If the evaluation causes the framework to forward to a different servlet
	 * then execution stops.
	 * Returning true from this method means that the framework has forwarded the
	 * request to a different servlet.  Returning false means that the default
	 * Next will be invoked.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 3 DE MAIO DE 2016 17H37MIN12S BRT
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(5);
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "aqui retorno Redefinir Senha Usuario", "WSRedefinirSenhaUsuario:Retorno").setDebugId(11));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "aqui Id Recibo Entrega preenchido", "WSRedefinirSenhaUsuario:idRecibo").setDebugId(12));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "aqui InMessage  Redefinir Senha Usuario", "InMessage").setDebugId(38));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "aqui OutMessage Redefinir Senha Usuario", "OutMessage").setDebugId(39));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition1", "WSRedefinirSenhaUsuario:Retorno", com.avaya.sce.runtime.Expression.INT_EQUAL, "0", false).setDebugId(10)).evaluate(mySession)) {

			if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition2", "WSRedefinirSenhaUsuario:idRecibo", com.avaya.sce.runtime.Expression.NOT_EMPTY).setDebugId(13)).evaluate(mySession)) {
				actions = new java.util.ArrayList(1);
				actions.add(new com.avaya.sce.runtime.Next("RedefinirSenhaUsuario-TransOK", "OK").setDebugId(15));
				if(evaluateActions(actions, mySession)) {
					return true;
				}
				actions = null;

			} else {
				actions = new java.util.ArrayList(2);
				actions.add(new com.avaya.sce.runtime.varoperations.Assign("CheckRetorno", "operador", true).setDebugId(20));
				actions.add(new com.avaya.sce.runtime.Next("RedefinirSenhaUsuario-AN_ErroTransacao", "NOK").setDebugId(17));
				if(evaluateActions(actions, mySession)) {
					return true;
				}
				actions = null;
			}


		} else {
			actions = new java.util.ArrayList(2);
			actions.add(new com.avaya.sce.runtime.varoperations.Assign("CheckRetorno", "operador", true).setDebugId(21));
			actions.add(new com.avaya.sce.runtime.Next("RedefinirSenhaUsuario-AN_ErroTransacao", "NOK").setDebugId(7));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
