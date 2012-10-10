package at.porscheinformatik.demo.web.components;

import javax.inject.Inject;

import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.Messages;

@Import(stack = {"bootstrap"})
public class Layout
{
    @Inject
    private ComponentResources resources;

    @Inject
    private Messages messages;

    @Property
    @Parameter
    private String title;

    public String defaultTitle()
    {
        return messages.get(resources.getPageName() + "-title");
    }

    public Messages getMessage()
    {
        return messages;
    }
}
