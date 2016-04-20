package flow.subflow.Pontos;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 20 DE ABRIL DE 2016 11H49MIN51S BRT
 */
public class ValidacaoMultiplusOpc2 extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 20 DE ABRIL DE 2016 11H49MIN51S BRT
	 */
	public ValidacaoMultiplusOpc2() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 20 DE ABRIL DE 2016 16H32MIN19S BRT
	 */
	protected String getSubflowName() {
		return("ValidacaoMultiplus");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 20 DE ABRIL DE 2016 16H32MIN19S BRT
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("ValidacaoMultiplus-Operador", "Pontos-Retorno");
		exitPoints.put("ValidacaoMultiplus-Retorno", "Pontos-ExtratoEmail");
		exitPoints.put("ValidacaoMultiplus-Desliga", "Pontos-Desliga");
		return exitPoints;
	}
}
