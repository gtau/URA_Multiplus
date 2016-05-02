package flow.subflow.Operador;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 2016-APR-29  09:38:36 PM
 */
public class ValidacaoMultiplus extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2016-APR-29  09:38:36 PM
	 */
	public ValidacaoMultiplus() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 2 DE MAIO DE 2016 18H44MIN36S BRT
	 */
	protected String getSubflowName() {
		return("ValidacaoMultiplus");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 2 DE MAIO DE 2016 18H44MIN36S BRT
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("ValidacaoMultiplus-Desliga", "Operador-Desliga");
		exitPoints.put("ValidacaoMultiplus-Operador", "Operador-ClienteIdentificado");
		exitPoints.put("ValidacaoMultiplus-Retorno", "Operador-ClienteIdentificado");
		return exitPoints;
	}
}
