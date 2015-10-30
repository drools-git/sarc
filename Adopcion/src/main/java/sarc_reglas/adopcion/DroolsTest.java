package sarc_reglas.adopcion;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
        	
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	//KieSession kSession = kContainer.newKieSession("sessionStateless");
        	StatelessKieSession sessionStateless = kContainer.newStatelessKieSession("sessionStateless");
            // go !
            Adopcion message = new Adopcion();
            message.setTipoRegistro("INSCRIPCION");
            message.setEscenario("GATE 0");
            sessionStateless.execute( message );
         //   sessionStateless.insert(message);
          //  sessionStateless.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }



    

}
