package flow.subflow.AtualizacaoCadastral;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 20 DE ABRIL DE 2016 11H7MIN22S BRT
 */
public class ProcedimentosEmail extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 20 DE ABRIL DE 2016 11H7MIN22S BRT
	 */
	public ProcedimentosEmail() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 23 DE ABRIL DE 2016 2H56MIN13S BRT
	 */
	protected String getSubflowName() {
		return("ProcedimentosEmail");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 23 DE ABRIL DE 2016 2H56MIN13S BRT
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("ProcedimentosEmail-Retorno", "AtualizacaoCadastral-Retorno");
		exitPoints.put("ProcedimentosEmail-Desliga", "AtualizacaoCadastral-Desliga");
		return exitPoints;
	}
}