package flow.subflow.NovaSenhaAcesso;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 19 DE ABRIL DE 2016 10H7MIN1S BRT
 */
public class RedefinirSenhaUsuario extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 19 DE ABRIL DE 2016 10H7MIN1S BRT
	 */
	public RedefinirSenhaUsuario() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 23 DE ABRIL DE 2016 2H56MIN12S BRT
	 */
	protected String getSubflowName() {
		return("RedefinirSenhaUsuario");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 23 DE ABRIL DE 2016 2H56MIN12S BRT
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("RedefinirSenhaUsuario-TransOK", "NovaSenhaAcesso-ZeraContador");
		exitPoints.put("RedefinirSenhaUsuario-TransNOK", "NovaSenhaAcesso-VerificaRetorno");
		return exitPoints;
	}
}
