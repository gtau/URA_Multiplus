/**
 * Last generated by Orchestration Designer at: 19 DE ABRIL DE 2016 20H31MIN20S BRT
 */
package espanhol.prompts;

public class MN_Principal extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for MN_Principal.
	 */
	public MN_Principal() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: 25 DE ABRIL DE 2016 19H55MIN23S BRT
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("MN_Principal");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,8000);
		setBargin(1,true);

	}
}
