package portugues.grammars;

/**
 * This class is generated automatically.
 * Only exit this class for Dynamic External grammars and override the method String getURL().
 * Last generated by Orchestration Designer at: 16 DE ABRIL DE 2016 16H24MIN25S BRT
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
        setRootLanguage("pt-br");
        setMode("dtmf");
        setBuiltin(true);
        setBuiltinMode("dtmf");
        setType("digits");
        setOptions("minlength=11;maxlength=11");
		//}}END:CLASS:CONSTRUCTOR
    }

}

