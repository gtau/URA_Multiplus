/**
 * Last generated by Orchestration Designer at: 25 DE ABRIL DE 2016 23H20MIN7S BRT
 */
package espanhol.prompts;

public class MN_ResgatesTAM extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for MN_ResgatesTAM.
	 */
	public MN_ResgatesTAM() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: 26 DE ABRIL DE 2016 17H19MIN29S BRT
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("MN_ResgatesTAM");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,3000);
		setBargin(1,true);

		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:411a",false));

		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:411b",false));

	}
}
