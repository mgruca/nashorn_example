package pl.rits;

import org.junit.Test;
import pl.rits.funky.Printer;
import pl.rits.tweets.Tweets;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * User: mgruca
 * Date: 22/11/14
 */
public class Iterating {

	@Test
	public void iterations() throws Exception {
		ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("nashorn");
		scriptEngine.put("printer", new Printer());
		scriptEngine.put("data", new Tweets().getTweets());
		scriptEngine.eval("load('src/resources/nashorn_arrays.js')");
	}
}
