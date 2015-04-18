package pl.rits;

import org.junit.Test;
import pl.rits.tweets.Tweets;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * User: Michal
 * Date: 2015-04-18
 */
public class General {

	@Test
	public void tweets() throws Exception {
		ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("nashorn");
		scriptEngine.put("tweets", new Tweets().getTweets().toArray());
		System.out.println(scriptEngine.eval("load('src/resources/nashorn_showcase.js')"));
	}
}
