package at.porscheinformatik.demo.web.services;

import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.annotations.Contribute;
import org.apache.tapestry5.services.javascript.JavaScriptStack;
import org.apache.tapestry5.services.javascript.JavaScriptStackSource;

public class AppModule
{
    @Contribute(JavaScriptStackSource.class)
    public static void addJquery(MappedConfiguration<String, JavaScriptStack> configuration)
    {
        configuration.addInstance("bootstrap", BootstrapStack.class);
    }
}
