
package org.mule.modules.quickbooks.windows.config;

import javax.annotation.Generated;
import org.mule.modules.quickbooks.windows.config.AbstractDefinitionParser.ParseDelegate;
import org.mule.modules.quickbooks.windows.processors.SyncActivityMessageProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-08-22T02:33:09-05:00", comments = "Build 3.4.3.1620.30ea288")
public class SyncActivityDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(SyncActivityMessageProcessor.class.getName());
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseProperty(builder, element, "accessTokenId", "accessTokenId");
        parseMapAndSetProperty(element, builder, "syncActivityRequest", "sync-activity-request", "sync-activity-request", new ParseDelegate<String>() {


            public String parse(Element element) {
                return element.getTextContent();
            }

        }
        );
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
