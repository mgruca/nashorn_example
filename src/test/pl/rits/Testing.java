package pl.rits;

import org.junit.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * User: Michal
 * Date: 2015-04-18
 */
public class Testing {

	@Test
	public void verify() throws Exception {
		ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("nashorn");
		scriptEngine.eval("load('src/resources/nashorn_invalid.js')");
	}
}
