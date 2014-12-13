package xyz.luan.sabv.js;

import java.io.FileReader;
import java.io.IOException;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public final class JsSetup {

    private JsSetup() {
        throw new RuntimeException("This class should not be instanciated.");
    }

    public static Invocable setupInvocable() throws ScriptException, NoSuchMethodException {
        final ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        final Invocable invocable = (Invocable) engine;

        engine.eval(reader("big.js"));
        engine.eval(reader("converter.js"));
        engine.eval(reader("validators.js"));
        engine.eval(reader("sabv.js"));

        return invocable;
    }

    private static FileReader reader(String fileName) {
        try {
            return new FileReader(JsSetup.class.getResource("/" + fileName).getFile());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
