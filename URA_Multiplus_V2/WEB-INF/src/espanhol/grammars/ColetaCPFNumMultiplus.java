package espanhol.grammars;

/**
 * This class is generated automatically.
 * Only exit this class for Dynamic External grammars and override the method String getURL().
 * Last generated by Orchestration Designer at: 2016-APR-29  09:37:37 PM
 */
public class ColetaCPFNumMultiplus extends com.avaya.sce.runtime.Grammar {

    //{{START:CLASS:FIELDS
    //}}END:CLASS:FIELDS

    /**
    * Constructor for ColetaCPFNumMultiplus.
    */
    public ColetaCPFNumMultiplus() {
		//{{START:CLASS:CONSTRUCTOR
        super();
        setRootLanguage("es-la");
        setMode("dtmf");
        setBuiltin(true);
        setBuiltinMode("dtmf");
        setType("digits");
        setOptions("minlength=12;maxlength=12");
		//}}END:CLASS:CONSTRUCTOR
    }

}

