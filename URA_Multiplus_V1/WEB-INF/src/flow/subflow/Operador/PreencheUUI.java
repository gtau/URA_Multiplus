package flow.subflow.Operador;

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
 * Last generated by Orchestration Designer at: 22 DE ABRIL DE 2016 20H24MIN58S BRT
 */
public class PreencheUUI extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 22 DE ABRIL DE 2016 20H24MIN58S BRT
	 */
	public PreencheUUI() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 26 DE ABRIL DE 2016 17H19MIN20S BRT
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("Operador-Desliga", "Default");
		next.setDebugId(36);
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 26 DE ABRIL DE 2016 17H19MIN20S BRT
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
	 * Last generated by Orchestration Designer at: 26 DE ABRIL DE 2016 17H19MIN20S BRT
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(10);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("UUI", "WSIdentificarParticipante:CPFNumMultiplus", false).setDebugId(43));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("UUI", ";", true).setDebugId(44));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("UUI", "WSIdentificarParticipante:Nome", false).setDebugId(45));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("UUI", " ", true).setDebugId(46));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("UUI", "WSIdentificarParticipante:Sobrenome", false).setDebugId(47));
		actions.add(new com.avaya.sce.runtime.varoperations.TrimChar("UUI", "UUI").setDebugId(49));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "aqui UUI", "UUI").setDebugId(48));
		actions.add(new com.avaya.sce.runtime.varoperations.Length("UUILength", "UUI").setDebugId(59));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "aqui tamanho UUI", "UUILength").setDebugId(62));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition1", "UUILength", com.avaya.sce.runtime.Expression.INT_GREATER_THAN, "96", false).setDebugId(58)).evaluate(mySession)) {
			actions = new java.util.ArrayList(2);
			actions.add(new com.avaya.sce.runtime.varoperations.SubString("UUI", "UUI", 0, 96).setDebugId(60));
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "aqui UUI com 96bytes", "UUI").setDebugId(63));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		}

		try {
			actions = new java.util.ArrayList(1);

			//{{START:CODEGEN:EXTENSIONPOINT:com.avaya.sce.cti.ui.blindCall
			actions.add(com.avaya.sce.runtime.connectivity.cti.CTIOpFactory.createBlindCallOperation("TransfereHumano", mySession, new com.avaya.sce.runtimecommon.VariableName("cticallinfo"), 
				new com.avaya.sce.runtimecommon.VariableName("VDNTransf"), new com.avaya.sce.runtimecommon.VariableName("UUI"), true).setDebugId(69));
			//}}END:CODEGEN:EXTENSIONPOINT:com.avaya.sce.cti.ui.blindCall

			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		} catch (java.io.IOException e1) {
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.varoperations.CaptureException(e1).setDebugId(-1));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		} catch (java.sql.SQLException e2) {
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.varoperations.CaptureException(e2).setDebugId(-1));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		} catch (com.avaya.sce.runtimecommon.SCERuntimeException e3) {
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.varoperations.CaptureException(e3).setDebugId(-1));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
