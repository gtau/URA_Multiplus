package flow;

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
 * Last generated by Dialog Designer at: 26 DE MARÇO DE 2013 14H18MIN44S BRT
 */
public class Log_Inicio extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Dialog Designer at: 26 DE MARÇO DE 2013 14H18MIN44S BRT
	 */
	public Log_Inicio() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 20 DE ABRIL DE 2016 9H24MIN54S BRT
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("MenuIdiomas", "Default");
		next.setDebugId(80);
		return next;
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
	 * Last generated by Orchestration Designer at: 20 DE ABRIL DE 2016 9H24MIN54S BRT
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(57);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("ContadorMenus", "0", true).setDebugId(25));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("Aplicacao:call_dnis", "cticallinfo:dnis", false).setDebugId(26));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("Channel:Value", "cticallinfo:stationextension", false).setDebugId(28));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("Aplicacao:call_ani", "cticallinfo:ani", false).setDebugId(29));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AAMMDD:ano", "date:year", false).setDebugId(30));
		actions.add(new com.avaya.sce.runtime.varoperations.SubString("AAMMDD:ano", "AAMMDD:ano", 0, 4).setDebugId(31));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AAMMDD:mes", "date:monthinyear", false).setDebugId(32));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AAMMDD:dia", "date:dayofmonth", false).setDebugId(33));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AAMMDD:hora", "time:hour", false).setDebugId(34));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AAMMDD:minuto", "time:minute", false).setDebugId(35));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AAMMDD:segundo", "time:second", false).setDebugId(36));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("AAMMDD:diasemana", "date:dayofweek", false).setDebugId(84));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "aqui dia da semana", "AAMMDD:diasemana").setDebugId(113));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("Aplicacao:call_uui", "cticallinfo:uui", false).setDebugId(38));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("Aplicacao:call_ucid", "cticallinfo:ucid", false).setDebugId(39));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("Aplicacao:call_date", "date:year", false).setDebugId(41));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_date", "-", true).setDebugId(42));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_date", "AAMMDD:mes", false).setDebugId(43));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_date", "-", true).setDebugId(44));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_date", "AAMMDD:dia", false).setDebugId(45));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_date", " ", true).setDebugId(46));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_date", "AAMMDD:hora", false).setDebugId(47));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_date", ":", true).setDebugId(48));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_date", "AAMMDD:minuto", false).setDebugId(49));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_date", ":", true).setDebugId(50));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_date", "AAMMDD:segundo", false).setDebugId(51));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_date", " ", true).setDebugId(114));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_date", "AAMMDD:diasemana", false).setDebugId(116));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "aqui data", "Aplicacao:call_date").setDebugId(52));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_id", "Aplicacao:call_UUU", false).setDebugId(55));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_id", "Channel:Value", false).setDebugId(56));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_id", "AAMMDD:ano", false).setDebugId(57));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_id", "AAMMDD:mes", false).setDebugId(58));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_id", "AAMMDD:dia", false).setDebugId(59));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_id", "AAMMDD:hora", false).setDebugId(60));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_id", "AAMMDD:minuto", false).setDebugId(61));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_id", "AAMMDD:segundo", false).setDebugId(62));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("Aplicacao:call_id", "AAMMDD:diasemana", false).setDebugId(117));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "aqui callid", "Aplicacao:call_id").setDebugId(63));
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("UUI", "AAMMDD:ano", false).setDebugId(65));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("UUI", "AAMMDD:mes", false).setDebugId(66));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("UUI", "AAMMDD:dia", false).setDebugId(67));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("UUI", "AAMMDD:hora", false).setDebugId(68));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("UUI", "AAMMDD:minuto", false).setDebugId(69));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("UUI", "AAMMDD:segundo", false).setDebugId(70));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("UUI", ";", true).setDebugId(71));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("UUI", "Aplicacao:call_ani", false).setDebugId(72));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("UUI", ";", true).setDebugId(73));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("UUI", "Aplicacao:call_dnis", false).setDebugId(74));
		actions.add(new com.avaya.sce.runtime.varoperations.Concatenate("UUI", ";", true).setDebugId(75));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "aqui UUI", "UUI").setDebugId(76));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 20 DE ABRIL DE 2016 9H24MIN54S BRT
	 */
	public java.util.Collection<VariableInfo> getLocalVariables(){
		java.util.Collection<VariableInfo> variables = new java.util.ArrayList<VariableInfo>();

		return variables;
	}
}
