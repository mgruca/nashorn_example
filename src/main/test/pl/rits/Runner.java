package pl.rits;

import org.junit.Test;
import pl.rits.funky.Printer;
import pl.rits.interfaces.Worker;
import pl.rits.tweets.Tweets;

import javax.script.*;

/**
 * User: mgruca
 * Date: 22/11/14
 */
public class Runner {

	ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("nashorn");

	@Test
	public void tweets() throws Exception {
		scriptEngine.put("tweets", new Tweets().getTweets().toArray());
		System.out.println(scriptEngine.eval("load('src/main/resources/nashorn_showcase.js')"));
	}

	@Test
	public void implementingInterfaces() throws Exception {
		scriptEngine.eval("load('src/main/resources/nashorn_twoWays.js')");
		Invocable invocable = (Invocable) scriptEngine;

		final Runnable action = invocable.getInterface(Runnable.class);

		action.run();

		System.out.println("\nAnd now a bit of magic\n");

		final Worker worker = invocable.getInterface(Worker.class);

		worker.run();
		worker.doWork();
	}

	@Test
	public void iterations() throws Exception {
		scriptEngine.put("printer", new Printer());
		scriptEngine.put("data", new Tweets().getTweets());
		scriptEngine.eval("load('src/main/resources/nashorn_arrays.js')");
	}
	@Test
	public void validate() throws Exception {
		scriptEngine.eval("load('src/main/resources/nashorn_invalid.js')");
	}
}
