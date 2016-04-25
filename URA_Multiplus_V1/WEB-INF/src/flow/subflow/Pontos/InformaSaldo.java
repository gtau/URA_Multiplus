package flow.subflow.Pontos;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 21 DE ABRIL DE 2016 13H47MIN58S BRT
 */
public class InformaSaldo extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 21 DE ABRIL DE 2016 13H47MIN58S BRT
	 */
	public InformaSaldo() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 25 DE ABRIL DE 2016 19H58MIN47S BRT
	 */
	protected String getSubflowName() {
		return("InformaSaldo");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 25 DE ABRIL DE 2016 19H58MIN47S BRT
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("InformaSaldo-Desliga", "Pontos-Desliga");
		exitPoints.put("InformaSaldo-Retorno", "Pontos-Retorno");
		return exitPoints;
	}
}
