package pl.rits;

import org.junit.Test;
import pl.rits.interfaces.Worker;

import javax.script.*;

/**
 * User: Michal
 * Date: 2015-04-18
 */
public class TwoWayInteroperability {

	@Test
	public void implementingInterfaces() throws Exception {
		ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("nashorn");
		scriptEngine.eval("load('src/resources/nashorn_twoWays.js')");
		Invocable invocable = (Invocable) scriptEngine;

		final Runnable action = invocable.getInterface(Runnable.class);

		action.run();

		System.out.println("\nAnd now a bit of magic\n");

		final Worker worker = invocable.getInterface(Worker.class);

		worker.run();
		worker.doWork();
	}
}
