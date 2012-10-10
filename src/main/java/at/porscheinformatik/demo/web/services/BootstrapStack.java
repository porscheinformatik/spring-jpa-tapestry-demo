package at.porscheinformatik.demo.web.services;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.tapestry5.Asset;
import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.ioc.annotations.Symbol;
import org.apache.tapestry5.services.AssetSource;
import org.apache.tapestry5.services.javascript.JavaScriptStack;
import org.apache.tapestry5.services.javascript.StylesheetLink;

public class BootstrapStack implements JavaScriptStack
{
    private final List<StylesheetLink> stylesheets;

    private List<Asset> javaScriptLibraries;

    public BootstrapStack(final AssetSource assetSource, @Symbol(SymbolConstants.PRODUCTION_MODE) Boolean productionMode)
    {
        final String css = productionMode ?
            "classpath:at/porscheinformatik/demo/web/bootstrap/css/bootstrap.min.css" :
            "classpath:at/porscheinformatik/demo/web/bootstrap/css/bootstrap.css";

        final String css_res = productionMode ?
            "classpath:at/porscheinformatik/demo/web/bootstrap/css/bootstrap-responsive.min.css" :
            "classpath:at/porscheinformatik/demo/web/bootstrap/css/bootstrap-responsive.css";

        stylesheets =
            Arrays.asList(new StylesheetLink(assetSource.getUnlocalizedAsset(css)),
                new StylesheetLink(assetSource.getUnlocalizedAsset(css_res)));

        final String js = productionMode ?
            "classpath:at/porscheinformatik/demo/web/bootstrap/js/bootstrap.min.js" :
            "classpath:at/porscheinformatik/demo/web/bootstrap/js/bootstrap.js";

        javaScriptLibraries =
            Arrays.asList(assetSource.getUnlocalizedAsset(js));
    }

    @Override
    public List<String> getStacks()
    {
        return Collections.emptyList();
    }

    @Override
    public List<Asset> getJavaScriptLibraries()
    {
        return javaScriptLibraries;
    }

    @Override
    public List<StylesheetLink> getStylesheets()
    {
        return stylesheets;
    }

    @Override
    public String getInitialization()
    {
        return null;
    }

}
