package pl.rits.validation;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * User: Michal
 * Date: 2015-04-18
 */
public class Validator {
	public void validate(String json, String validationScript) throws Exception {
		try {
			ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

			engine.put("params", json);
			engine.eval("load('"+validationScript+"')");
			final Object returnValue = engine.eval("validateMyForm(params)");
			if (Boolean.valueOf(returnValue.toString()))
				throw new RuntimeException("Invalid json");
		} catch (Exception e) {
			throw new RuntimeException("Something went wrong in init");
		}
	}
}
